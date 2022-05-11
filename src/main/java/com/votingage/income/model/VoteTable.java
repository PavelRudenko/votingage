package com.votingage.income.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "voting_table")
public class VoteTable {
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "user_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )

    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "choice", updatable = false, nullable = false)
    private Boolean choice;

    @Column(name = "voting_title", updatable = false, nullable = false)
    private String votingTitle;

    @Column(name = "timestamp", updatable = false, nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "tablePrivacy", updatable = false, nullable = false)
    private Boolean tablePrivacy;

    @ManyToOne
    private User votedUsers;


}
