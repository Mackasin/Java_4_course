package java_ls.lr1.marker;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Create a UserProfile object
        UserProfile userProfile = new UserProfile("JohnDoe", "johndoe@example.com", 25);
        // Save the UserProfile object to a file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("userprofile.txt"))) {
            outputStream.writeObject(userProfile);
            System.out.println("User profile saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Load the UserProfile object from the file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("userprofile.txt"))) {
            UserProfile loadedProfile = (UserProfile) inputStream.readObject();
            System.out.println("Loaded user profile: " + loadedProfile.getUsername() + ", " + loadedProfile.getEmail() + ", " + loadedProfile.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
