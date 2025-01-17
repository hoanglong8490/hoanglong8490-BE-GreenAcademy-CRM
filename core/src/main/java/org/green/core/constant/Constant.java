package org.green.core.constant;

public class Constant {
    // Mã trạng thái HTTP
    public static final int SUCCESS = 200;
    public static final int NO_CONTENT = 204;
    public static final int BAD_REQUEST = 400;
    public static final int NOT_FOUND = 404;
    public static final int INTERNAL_SERVER_ERROR = 500;

    // Thông điệp phản hồi
    public static final String SUCCESS_MESSAGE = "Success";
    public static final String NO_CONTENT_MESSAGE = "No content available";
    public static final String BAD_REQUEST_MESSAGE = "Bad request";
    public static final String NOT_FOUND_MESSAGE = "Resource not found";
    public static final String INTERNAL_SERVER_ERROR_MESSAGE = "Internal server error";
    public static final String VALIDATION_ERROR_MESSAGE = "Validation error";

    // Các thông điệp khác
    public static final String UNAUTHORIZED_MESSAGE = "Unauthorized access";
    public static final String FORBIDDEN_MESSAGE = "Access forbidden";
    public static final String UNPROCESSABLE_ENTITY_MESSAGE = "Unprocessable entity";
    public static final String CONFLICT_MESSAGE = "Conflict occurred";
}
