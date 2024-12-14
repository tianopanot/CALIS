import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

class manualGui {

    public manualGui() {
        // Constructor (can initialize any required components or settings here)
    }

    // Method to create the title panel
    public JPanel createTitlePanel() {
        Border border = BorderFactory.createLineBorder(Color.black, 2);

        // Title Label
        JLabel titleLabel = new JLabel("C.A.L.I.S. User Manual", JLabel.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
        titleLabel.setBorder(border);

        // Title Panel
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBackground(new Color(67, 70, 75));
        titlePanel.add(titleLabel, BorderLayout.CENTER);

        return titlePanel;
    }

    // Method to create the content panel
    public JPanel createContentPanel() {
        // Header Label for Contents
        JLabel contentLabel = new JLabel("Table Of Contents", JLabel.CENTER);
        contentLabel.setForeground(Color.BLACK);
        contentLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
        contentLabel.setBorder(new EmptyBorder(120, 0, 20, 0)); // Add some spacing

        // Items for the content
        JLabel itemsLabel = new JLabel(
            "<html>1. Introduction<br>"
                    + "2. System Requirements<br>"
                    + "3. Installation and Setup<br>"
                    + "4. Getting Started<br>"
                    + "5. Features and Usage Instructions<br>"
                    + "        -Home<br>"
                    + "        -Locker Manager<br>"
                    + "        -Space Checker<br>"
                    + "        -History<br>"
                    + "        -Manual<br>"
                    + "        -About<br>"
                    + "6. Troubleshooting<br>"
                    + "7. Contact And Support</html>",
                
                    JLabel.CENTER);
         
        itemsLabel.setForeground(Color.BLACK);
        itemsLabel.setFont(new Font("SansSerif", Font.PLAIN, 25));
        itemsLabel.setVerticalAlignment(JLabel.TOP);

        // Content Panel
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(new Color(59, 75, 85));
        contentPanel.add(contentLabel, BorderLayout.NORTH);
        contentPanel.add(itemsLabel, BorderLayout.CENTER);

        return contentPanel;
    }

    // Method to combine title and content panels
    public JPanel createMainPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Add title and content panels
        mainPanel.add(createTitlePanel(), BorderLayout.NORTH);
        mainPanel.add(createContentPanel(), BorderLayout.CENTER);

        return mainPanel;
    }
}