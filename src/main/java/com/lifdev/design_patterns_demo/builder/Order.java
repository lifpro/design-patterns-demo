package com.lifdev.design_patterns_demo.builder;

public class Order {

    private String product;
    private int quantity;
    private double price;
    private boolean giftWrap;
    private String deliveryMode;

    private Order(Builder builder) {
        this.product = builder.product;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.giftWrap = builder.giftWrap;
        this.deliveryMode = builder.deliveryMode;
    }

    public static class Builder {
        private String product;
        private int quantity;
        private double price;
        private boolean giftWrap;
        private String deliveryMode;

        public Builder product(String product) {
            this.product = product;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder giftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Builder deliveryMode(String deliveryMode) {
            this.deliveryMode = deliveryMode;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}

