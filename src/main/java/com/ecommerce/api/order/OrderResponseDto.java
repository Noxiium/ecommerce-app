package com.ecommerce.api.order;

import com.ecommerce.api.order_item.OrderItem;
import com.ecommerce.api.product.Product;
import com.ecommerce.api.user.User;
import com.ecommerce.api.utility.EnumConstants;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link Order}
 */
@NoArgsConstructor
@Getter
@Setter
public class OrderResponseDto implements Serializable {
    private Long orderId;
    private Long totalPrice;
    private int totalQuantity;
    private List<OrderItemDto> orderItems;
    private UserDto user;
    private OrderTimeline orderTimeline;
    private EnumConstants.OderStatus orderStatus;

    /**
     * DTO for {@link OrderItem}
     */
    @NoArgsConstructor
    @Getter
    @Setter
    public static class OrderItemDto implements Serializable {
        private Long orderItemId;
        private int unitPrice;
        private Long totalPrice;
        private int itemQuantity;
        private ProductDto product;

        /**
         * DTO for {@link Product}
         */
        @NoArgsConstructor
        @Getter
        @Setter
        public static class ProductDto implements Serializable {
            private Long productId;
        }
    }

    /**
     * DTO for {@link User}
     */
    @NoArgsConstructor
    @Getter
    @Setter
    public static class UserDto implements Serializable {
        private Long userId;
        private String name;
    }

    /**
     * DTO for {@link OrderTimeline}
     */
    @NoArgsConstructor
    @Setter
    @Getter
    public static class OrderTimeline implements Serializable {
        private Long orderTimelineId;
        private LocalDateTime orderPlaceDateTime;
        private LocalDateTime orderApproveDateTime;
        private LocalDateTime readyToDeliverDateTime;
        private LocalDateTime deliveryDateTime;
    }
}