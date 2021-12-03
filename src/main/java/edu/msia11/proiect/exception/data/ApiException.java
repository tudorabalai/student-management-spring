package edu.msia11.proiect.exception.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiException {
    private ZonedDateTime timestamp;
    private String status;
    private String message;
}