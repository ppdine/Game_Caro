package view;

import dao.UserDAO;

import javax.swing.JOptionPane;

import model.User;
import controller.Room;
import controller.Server;
import controller.ServerThread;

/**
 * @author Admin
 */
public class Admin extends javax.swing.JFrame implements Runnable {
    private final UserDAO userDAO;

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        threadRoomListView.setEditable(false);
        messageView.setEditable(false);
        userDAO = new UserDAO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        threadRoomListView = new javax.swing.JTextArea();
        viewThreadButton = new javax.swing.JButton();
        viewRoomListButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        boardLabel = new javax.swing.JLabel();
        noticeTextField = new javax.swing.JTextField();
        publishMessageButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageView = new javax.swing.JTextArea();
        userIdTextField = new javax.swing.JTextField();
        banButton = new javax.swing.JButton();
        warnButton = new javax.swing.JButton();
        cancelBanButton = new javax.swing.JButton();
        reasonComboBox = new javax.swing.JComboBox<>();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        threadRoomListView.setColumns(20);
        threadRoomListView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        threadRoomListView.setRows(5);
        jScrollPane1.setViewportView(threadRoomListView);

        viewThreadButton.setText("Xem danh sách luồng");
        viewThreadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewThreadButtonActionPerformed(evt);
            }
        });

        viewRoomListButton.setText("Xem danh sách phòng");
        viewRoomListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoomListButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        boardLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        boardLabel.setForeground(new java.awt.Color(255, 255, 255));
        boardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boardLabel.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(boardLabel)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        noticeTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noticeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noticeTextFieldKeyPressed(evt);
            }
        });

        publishMessageButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        publishMessageButton.setText("Phát thông báo");
        publishMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishMessageButtonActionPerformed(evt);
            }
        });

        messageView.setColumns(20);
        messageView.setRows(5);
        jScrollPane2.setViewportView(messageView);

        banButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        banButton.setText("Ban");
        banButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banButtonActionPerformed(evt);
            }
        });

        warnButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        warnButton.setText("Cảnh cáo");
        warnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warnButtonActionPerformed(evt);
            }
        });

        cancelBanButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelBanButton.setText("Huỷ Ban");
        cancelBanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBanButtonActionPerformed(evt);
            }
        });

        reasonComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reasonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn lý do", "Ngôn ngữ thô tục - xúc phạm người khác", "Spam đăng nhập", "Sử dụng game với mục đích xấu", "Phát hiện rò rỉ bảo mật - tài khoản tạm thời bị khoá để kiểm tra thêm" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(viewThreadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(viewRoomListButton, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addGap(61, 61, 61))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addComponent(jScrollPane2))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(noticeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(publishMessageButton))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(reasonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(cancelBanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(warnButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(banButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(viewRoomListButton)
                                        .addComponent(viewThreadButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(noticeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(publishMessageButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(banButton)
                                        .addComponent(warnButton)
                                        .addComponent(cancelBanButton)
                                        .addComponent(reasonComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewThreadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewThreadButtonActionPerformed
        StringBuilder res = new StringBuilder();
        String room;
        int i = 1;
        for (ServerThread serverThread : Server.serverThreadBus.getListServerThreads()) {
            if (serverThread.getRoom() == null)
                room = null;
            else room = "" + serverThread.getRoom().getId();
            if (serverThread.getUser() != null) {
                res.append(i).append(". Client-number: ").append(serverThread.getClientNumber()).append(", User-ID: ").append(serverThread.getUser().getID()).append(", Room: ").append(room).append("\n");
            } else {
                res.append(i).append(". Client-number: ").append(serverThread.getClientNumber()).append(", User-ID: null, Room: ").append(room).append("\n");
            }
            i++;
        }
        threadRoomListView.setText(res.toString());
    }//GEN-LAST:event_viewThreadButtonActionPerformed

    private void viewRoomListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoomListButtonActionPerformed
        StringBuilder res = new StringBuilder();
        int i = 1;
        for (ServerThread serverThread : Server.serverThreadBus.getListServerThreads()) {
            Room room1 = serverThread.getRoom();
            String listUser = "List user ID: ";
            if (room1 != null) {
                if (room1.getNumberOfUser() == 1) {
                    listUser += room1.getUser1().getUser().getID();
                } else {
                    listUser += room1.getUser1().getUser().getID() + ", " + room1.getUser2().getUser().getID();
                }
                res.append(i).append(". Room_ID: ").append(room1.getId()).append(", Number of player: ").append(room1.getNumberOfUser()).append(", ").append(listUser).append("\n");
                i++;
            }

        }
        threadRoomListView.setText(res.toString());
    }//GEN-LAST:event_viewRoomListButtonActionPerformed

    private void publishMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishMessageButtonActionPerformed
        sendMessage();
    }//GEN-LAST:event_publishMessageButtonActionPerformed

    private void noticeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noticeTextFieldKeyPressed
        if (evt.getKeyCode() == 10) {
            sendMessage();
        }
    }//GEN-LAST:event_noticeTextFieldKeyPressed

    private void banButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banButtonActionPerformed
        try {
            if (isInvalidForm()) return;
            int userId = Integer.parseInt(userIdTextField.getText());
            User user = new User();
            user.setID(userId);
            userDAO.updateBannedStatus(user, true);
            ServerThread serverThread = Server.serverThreadBus.getServerThreadByUserID(userId);
            serverThread.write("banned-notice," + reasonComboBox.getSelectedItem());
            if (serverThread.getRoom() != null) {
                Room room = serverThread.getRoom();
                ServerThread competitorThread = room.getCompetitor(serverThread.getClientNumber());
                room.setUsersToNotPlaying();
                if (competitorThread != null) {
                    room.decreaseNumberOfGame();
                    competitorThread.write("left-room,");
                    competitorThread.setRoom(null);
                }
                serverThread.setRoom(null);
            }
            Server.admin.addMessage("User có ID " + userId + " đã bị BAN");
            serverThread.setUser(null);
            Server.serverThreadBus.boardCast(-1, "chat-server," + "User có ID " + userId + " đã bị BAN");
            JOptionPane.showMessageDialog(rootPane, "Đã BAN user " + userId);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Có lỗi xảy ra");
        }
    }//GEN-LAST:event_banButtonActionPerformed

    private void cancelBanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBanButtonActionPerformed
        try {
            if (userIdTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ID của User");
                return;
            }
            int userId = Integer.parseInt(userIdTextField.getText());
            User user = new User();
            user.setID(userId);
            userDAO.updateBannedStatus(user, false);
            userIdTextField.setText("");
            JOptionPane.showMessageDialog(rootPane, "Đã huỷ BAN user " + userId);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Có lỗi xảy ra");
        }
    }//GEN-LAST:event_cancelBanButtonActionPerformed

    private void warnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warnButtonActionPerformed
        try {
            if (isInvalidForm()) return;
            int userId = Integer.parseInt(userIdTextField.getText());
            Server.serverThreadBus.sendMessageToUserID(userId, "warning-notice," + reasonComboBox.getSelectedItem());
            JOptionPane.showMessageDialog(rootPane, "Đã cảnh cáo user " + userId);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Có lỗi xảy ra");
        }
    }//GEN-LAST:event_warnButtonActionPerformed

    private void sendMessage() {
        String message = noticeTextField.getText();
        if (message.isEmpty()) return;
        String temp = messageView.getText();
        temp += "Thông báo từ máy chủ : " + message + "\n";
        messageView.setText(temp);
        messageView.setCaretPosition(messageView.getDocument().getLength());
        Server.serverThreadBus.boardCast(-1, "chat-server,Thông báo từ máy chủ : " + message);
        noticeTextField.setText("");
    }

    public void addMessage(String message) {
        String tmp = messageView.getText();
        tmp = tmp + message + "\n";
        messageView.setText(tmp);
        messageView.setCaretPosition(threadRoomListView.getDocument().getLength());
    }

    private boolean isInvalidForm() {
        if (userIdTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ID của User");
            return true;
        }
        if (reasonComboBox.getSelectedIndex() < 1) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn lý do");
            return true;
        }
        return false;
    }

    private javax.swing.JButton banButton;
    private javax.swing.JLabel boardLabel;
    private javax.swing.JButton cancelBanButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    public static javax.swing.JTextArea messageView;
    private javax.swing.JTextField noticeTextField;
    private javax.swing.JButton publishMessageButton;
    private javax.swing.JComboBox<String> reasonComboBox;
    private javax.swing.JTextArea threadRoomListView;
    private javax.swing.JTextField userIdTextField;
    private javax.swing.JButton viewRoomListButton;
    private javax.swing.JButton viewThreadButton;
    private javax.swing.JButton warnButton;

    @Override
    public void run() {
        new Admin().setVisible(true);
    }
}
