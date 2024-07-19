package AppleTree_gongik.dto;

public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private UserRole userRole;
    private String encryptedPassword;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
