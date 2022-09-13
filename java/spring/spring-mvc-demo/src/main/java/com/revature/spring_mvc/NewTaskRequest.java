package com.revature.spring_mvc;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NewTaskRequest {

    private String id;
    private String title;
    private String description;
    private int pointValue;
    private String creatorId;
    private String assigneeId;
    private String label;

}