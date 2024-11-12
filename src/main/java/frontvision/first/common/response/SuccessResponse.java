package frontvision.first.common.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SuccessResponse<T> {

    private final boolean status = true;
    private T data;

    public static <T> SuccessResponse<T> of(T data) {
        SuccessResponse<T> successResponse = new SuccessResponse<>();
        successResponse.data = data;

        return successResponse;
    }

    public ResponseEntity<SuccessResponse<T>> setStatus(HttpStatus httpStatus) {
        return ResponseEntity
                .status(httpStatus)
                .body(this);
    }
}
