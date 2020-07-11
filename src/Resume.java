import java.util.UUID;

public class Resume {
    String uuid;

    public Resume() {
        uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "id: " + uuid;
    }
}
