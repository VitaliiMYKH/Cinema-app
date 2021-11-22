package mykh.vitalii.spring.service.mapper;

import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;
import mykh.vitalii.spring.dto.response.OrderResponseDto;
import mykh.vitalii.spring.model.Order;
import mykh.vitalii.spring.model.Ticket;
import mykh.vitalii.spring.util.DateTimePatternUtil;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper implements ResponseDtoMapper<OrderResponseDto, Order> {
    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(DateTimePatternUtil.DATE_TIME_PATTERN);

    @Override
    public OrderResponseDto mapToDto(Order order) {
        OrderResponseDto responseDto = new OrderResponseDto();
        responseDto.setId(order.getId());
        responseDto.setUserId(order.getUser().getId());
        responseDto.setOrderTime(order.getOrderTime().format(formatter));
        responseDto.setTicketIds(order.getTickets()
                .stream()
                .map(Ticket::getId)
                .collect(Collectors.toList()));
        return responseDto;
    }
}
