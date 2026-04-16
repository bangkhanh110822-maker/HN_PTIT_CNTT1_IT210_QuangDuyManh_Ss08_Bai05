Phần 1 - Thiết kế kiến trúc & logic
tourCode:
custom field-level: @ValidTourCode để bắt format riêng VN_ hoặc INT_ + 5 chữ số.
adultPrice, childPrice:
annotation chuẩn: @NotNull, @DecimalMin(value="0.0", inclusive=false) cho điều kiện > 0.
custom class-level: @ValidPriceRange để bắt quan hệ childPrice <= adultPrice.
startDate, endDate:
annotation chuẩn: @NotNull, @FutureOrPresent cho startDate >= today.
custom class-level: @ValidDateRange để bắt endDate > startDate.
Luồng xử lý dùng @Valid + BindingResult trong POST controller để chặn lỗi trước khi “lưu”.