package ua.social.network.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Mykola Yashchenko
 */
@Getter
@Setter
@Entity
@Table(name = "files")
public class File extends BaseEntity {

    @Column(name = "file_path", nullable = false, unique = true)
    private String filePath;

    @Column(name = "user_id", nullable = false)
    private String userId;
}
