package com.rishabh.journalApp.entity;

import com.rishabh.journalApp.enums.Sentiment;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection = "journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {
    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime data;
    private Sentiment sentiment;

}
