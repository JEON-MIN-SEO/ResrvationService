package AppleTree_gongik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_table")
@NoArgsConstructor //모든 필드를 받아야 함으로 기본 생성자는 필요하지 않다고 판단
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    private String encryptedPassword;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
