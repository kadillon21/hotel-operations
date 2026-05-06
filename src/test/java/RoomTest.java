import com.pluralsight.model.Room;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void should_check_in(){

        // Arrange
        Room room = new Room(2, 300, false, false, false);

        // Act
        room.checkIn();

        // Asset

        assertFalse(room.isAvailable());
        assertTrue(room.isDirty());
    }

    @Test
    public void should_check_out(){

        // Arrange
        Room room = new Room(2, 300, false, false, false);

        // Act
        room.checkOut();

        // Asset

        assertTrue(room.isAvailable());
        assertFalse(room.isDirty());
    }

    @Test
    public void should_clean_room(){

        // Arrange
        Room room = new Room(2, 300, false, false, false);

        // Act
        room.cleanRoom();

        // Asset

        assertFalse(room.isDirty());
    }


}
