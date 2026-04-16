Kịch bản test rủi ro (dữ liệu độc hại)
Sai mã tour + ngày đảo ngược + giá âm
Input: tourCode=ABC_12, adultPrice=-100, childPrice=999999, startDate=2026-05-10, endDate=2026-05-01
Hệ thống chặn:
@ValidTourCode bắt sai format mã.
@DecimalMin bắt giá âm.
@ValidDateRange bắt endDate <= startDate.
@ValidPriceRange bắt childPrice > adultPrice.
Kết quả: trả về form với lỗi chi tiết, không 500.
Cố tình gửi rỗng/null toàn bộ trường
Input: tất cả trường bỏ trống
Hệ thống chặn:
@NotNull trên các field.
Validator class-level bỏ qua nếu thiếu dữ liệu (return true) để tránh NPE/crash.
Kết quả: lỗi validation hiển thị ở form, server không văng exception.
Tour code gần đúng để lách luật
Input: tourCode=VN_1234A hoặc INT_123456
Hệ thống chặn:
Regex trong TourCodeValidator chỉ chấp nhận đúng ^(VN_|INT_)\\d{5}$.
Kết quả: reject tại validation, không đi vào luồng lưu.
