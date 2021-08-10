package io.github.tj20201.consolelibrary;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import io.github.tj20201.consolelibrary.custom.Button;

import static java.lang.Integer.valueOf;

public class Window {
    static JFrame window;

    // For forks
    static String bookdb = "https://tj20201.github.io/consolelibrary/books/";

    // Book settings
    static Boolean bookOpen = false;
    static int currentPage = 0;
    static String currentBook = "";

    // Search settings
    static String searchTerm = "";
    static Boolean searchFocused = false;
    static Boolean isSearching = false;

    // Operating Systems
    private static String osName = System.getProperty("os.name").toLowerCase();
    public static boolean IS_WINDOWS = (osName.indexOf("win") >= 0);
    public static boolean IS_MAC = (osName.indexOf("mac") >= 0);
    public static String os = null;
    // Solaris and Unix are currently unsupported.

    // AppData folder
    static File appData;

    // Errors
    static Exception unsupportedSystem = new Exception("Unsupported operating system! Please use Windows or Mac.");

    // Images
    static Image icon;

    static {
        try {
            icon = ImageIO.read(Window.class.getClassLoader().getResourceAsStream("icon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates the main window.<br>
     * Can be called from anywhere as long as it can access this class.<br>
     * @author TJ20201
     */
    public static void main(String[] args) throws Exception {
        // Get OS version and set OS-specific variables
        if (IS_WINDOWS) {
            os = "windows";
            appData = new File(System.getenv("APPDATA"));
        } else if (IS_MAC) {
            os = "mac";
            appData = new File(System.getProperty("user.home") + "\\Local Settings\\Application Data");
        } else {
            System.out.println("You are using an unsupported operating system! Either use a supported one (windows or mac) or contribute to the github (https://github.com/TJ20201/consolelibrary)");
            throw unsupportedSystem;
        }

        window = new JFrame();
        FlowLayout layout = new FlowLayout();
        // Initialization

        window.setTitle("Console Library");
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setIconImage(icon);

        // Size

        window.setPreferredSize(new Dimension(713, 450));
        window.setMinimumSize(new Dimension(513, 250));
        window.setSize(window.getPreferredSize());

        // Other

        window.setLayout(null);
        window.getContentPane().setBackground(new Color(57, 57, 57));
        window.getContentPane().setForeground(new Color(236, 236, 236));

        // Update Window
        updateWindow(window);

        // Listeners
        window.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                updateWindow(window);
            }
        });
    }

    private static void updateWindow(JFrame wind) {
        // READ button
        JButton readBtn = Button.makeButton("Read", new Rectangle(10, 10, 80, 25), "red");
        // WRITE button
        JButton writeBtn = Button.makeButton("Write", new Rectangle(100, 10, 80, 25), "red");
        // BROWSE button
        JButton browseBtn = Button.makeButton("Browse", new Rectangle(190, 10, 80, 25), "red");
        // LIBRARY button
        JButton libraryBtn = Button.makeButton("Your Library", new Rectangle(280, 10, 120, 25), "red");

        // SEARCH field
        JTextField searchField = new JTextField(searchTerm);
        searchField.setBounds(10, 40, wind.getWidth() + wind.getWidth() - wind.getWidth() - 60, 25);
        searchField.addFocusListener(new FocusListener(){@Override public void focusGained(FocusEvent e) {searchFocused = true;}@Override public void focusLost(FocusEvent e){searchFocused = false;}});

        // SEARCH button
        JButton searchBtn = Button.makeButton("Search", new Rectangle(wind.getWidth() + wind.getWidth() - wind.getWidth() - 50, 40, 25, 25));


        // DISCLAIMER text
        JLabel disclaimer = new JLabel("DISCLAIMER: This is named ConsoleLibrary due to the old (c++) version using an actual console.");
        int disclaimerY = wind.getHeight() + wind.getHeight() - wind.getHeight() - 70;
        disclaimer.setBounds(10, disclaimerY, wind.getWidth() - 20, 25);
        disclaimer.setForeground(new Color(123, 123, 123));

        // JPANEL bookInterface
        JPanel bookInterface = new JPanel();
        bookInterface.setBounds(10, 70, wind.getWidth()+wind.getWidth()-wind.getWidth()-35, wind.getHeight()+wind.getHeight()-wind.getHeight()-195);

        // If a book is open, get the currentBook and currentPage variable
        if (bookOpen) {
            /* TODO: if book open, show book page with Stop Reading button that saves where you are */
        } else {
            /* TODO: if book not open, and is searching then show results for all books matching searchTerm */
            if (isSearching) {
                // code
            }
        }

        // Remove all content and add new content
        wind.getContentPane().removeAll();
        wind.add(readBtn);
        wind.add(writeBtn);
        wind.add(searchBtn);
        wind.add(browseBtn);
        wind.add(libraryBtn);
        wind.add(disclaimer);
        wind.add(searchField);
        wind.add(bookInterface);

        searchTerm = searchField.getText();

        // Repaint
        wind.repaint();
        wind.getContentPane().revalidate();

        wind.getContentPane().setBackground(new Color(57, 57, 57));
        wind.setSize(wind.getWidth(), wind.getHeight());
        wind.setVisible(true);
        searchTerm = searchField.getText();


    }

}
