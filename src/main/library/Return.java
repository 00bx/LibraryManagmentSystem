/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.library;
import Connection.JavaDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Return extends javax.swing.JFrame {

     Connection conn;
    //object for connection with database 
    ResultSet rs;
    //to chech browse data on database
    PreparedStatement pst;
    // to send statement as sql to database and gives database values of user
    //note that hardu dana class la package java.sql dan..
    
    public Return() {
       super("Return Book");
        initComponents();
        conn = JavaDatabase.connecrDp();
    }

    public void Delete(){
        
        String sql = "delete from Issue where Student_id = ? and Book_id = ?  ";
        // bo srinaway datakan lanaw database drustkraw
        //dabe nawe table w filekan ba haman nawy naw database aka bn
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1 , jStudentId2.getText() );
            pst.setString(2 , jBook_Id.getText() );

            pst.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null , e);
        }
    }
    
    public void ReturnUpdate(){
 String sql = "insert into Return ( Student_Id , Fname , Sname , Grade , Semester , Course , Age , Book_id , Book_Name , Author , Price , Pages ,DateOfIssue, DateOfReturn) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
   try {   
            pst = conn.prepareStatement(sql);
            
    pst.setString(1 , jStudentId2.getText() );
    pst.setString(2 , FirstName.getText() );
    pst.setString(3 , jSecondName.getText() );
    pst.setString(4 ,jgrade.getText());
    pst.setString(5 , jSemesterField1.getText() );
    pst.setString(6 , jCourseField1.getText() );
    pst.setString(7 , jAgeField1.getText() );
    pst.setString(8 , jBook_Id.getText() );
    pst.setString(9 ,jBook_Name.getText());
    pst.setString(10 , AuthorField.getText() );
    pst.setString(11 ,PriceField.getText());
    pst.setString(12, PageField.getText() );
    pst.setString(13, DateField.getText());
    pst.setString(14, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());

//set string 13 am statementa b chuna naw database ba sheway barwary halbzherdraw , getdata editor aw barwaray user haldabzhere daxl dabe . getui component am method a dabe lagal hamu add on a zyadkrawakni swing bakarbhendre pashan .getstring bkait bo naw database
pst.execute();
            JOptionPane.showMessageDialog(null , " Book Returned :> ");
            setVisible(false);
            Home Page = new Home();
            Page.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null , e);
        } 
    
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jAgeField = new javax.swing.JTextField();
        jCourseField = new javax.swing.JTextField();
        jSemesterField = new javax.swing.JTextField();
        jgradeField = new javax.swing.JTextField();
        jSecondName1 = new javax.swing.JTextField();
        FirstName1 = new javax.swing.JTextField();
        jStudentId1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PageField = new javax.swing.JTextField();
        PriceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AuthorField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBook_Name = new javax.swing.JTextField();
        jBook_Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DateField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jAgeField1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jStudentId2 = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        jSecondName = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jgrade = new javax.swing.JTextField();
        jSemesterField1 = new javax.swing.JTextField();
        jCourseField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\images\\icons8-left-arrow-50.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 175, 146));
        jLabel15.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 151, 83));
        jLabel15.setText("             Student Details");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 151, 83), 2));

        jLabel20.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(238, 151, 83));
        jLabel20.setText("Student ID");

        jLabel17.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(238, 151, 83));
        jLabel17.setText("First Name");

        jLabel22.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(238, 151, 83));
        jLabel22.setText("Second name");

        jLabel19.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(238, 151, 83));
        jLabel19.setText("Grade");

        jLabel16.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 151, 83));
        jLabel16.setText("Semester");

        jLabel18.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(238, 151, 83));
        jLabel18.setText("Course");

        jLabel21.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(238, 151, 83));
        jLabel21.setText("Age");

        jAgeField.setEditable(false);
        jAgeField.setForeground(new java.awt.Color(238, 151, 83));
        jAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgeFieldActionPerformed(evt);
            }
        });

        jCourseField.setEditable(false);
        jCourseField.setForeground(new java.awt.Color(238, 151, 83));
        jCourseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCourseFieldActionPerformed(evt);
            }
        });

        jSemesterField.setEditable(false);
        jSemesterField.setForeground(new java.awt.Color(238, 151, 83));
        jSemesterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSemesterFieldActionPerformed(evt);
            }
        });

        jgradeField.setEditable(false);
        jgradeField.setForeground(new java.awt.Color(238, 151, 83));
        jgradeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgradeFieldActionPerformed(evt);
            }
        });

        jSecondName1.setEditable(false);
        jSecondName1.setForeground(new java.awt.Color(238, 151, 83));
        jSecondName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSecondName1ActionPerformed(evt);
            }
        });

        FirstName1.setEditable(false);
        FirstName1.setForeground(new java.awt.Color(238, 151, 83));
        FirstName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName1ActionPerformed(evt);
            }
        });

        jStudentId1.setForeground(new java.awt.Color(238, 151, 83));
        jStudentId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStudentId1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\images\\search.png")); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(242, 151, 107));
        jLabel1.setFont(new java.awt.Font("Rabar_038", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("       Date Of Return :");
        jLabel1.setOpaque(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 118, 78), 1, true));

        PageField.setEditable(false);
        PageField.setForeground(new java.awt.Color(222, 119, 71));
        PageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PageFieldActionPerformed(evt);
            }
        });

        PriceField.setEditable(false);
        PriceField.setForeground(new java.awt.Color(222, 119, 71));
        PriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 151, 83));
        jLabel2.setText("Book ID");

        jLabel7.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 151, 83));
        jLabel7.setText("Pages");

        AuthorField.setEditable(false);
        AuthorField.setForeground(new java.awt.Color(222, 119, 71));
        AuthorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorFieldActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 175, 146));
        jLabel6.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 151, 83));
        jLabel6.setText("           Issued Book Detail ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 151, 83), 2, true));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 151, 83));
        jLabel4.setText("Author");

        jBook_Name.setEditable(false);
        jBook_Name.setForeground(new java.awt.Color(222, 119, 71));
        jBook_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBook_NameActionPerformed(evt);
            }
        });

        jBook_Id.setForeground(new java.awt.Color(222, 119, 71));
        jBook_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBook_IdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 151, 83));
        jLabel3.setText("Name");

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 151, 83));
        jLabel5.setText("Price");

        DateField.setEditable(false);
        DateField.setForeground(new java.awt.Color(222, 119, 71));
        DateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 151, 83));
        jLabel9.setText("Date Of Issued");

        jButton6.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\images\\search.png")); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBook_Id)
                                    .addComponent(jBook_Name)
                                    .addComponent(AuthorField)
                                    .addComponent(PriceField)
                                    .addComponent(PageField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6)))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBook_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jBook_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PageField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 151, 83)));

        jAgeField1.setEditable(false);
        jAgeField1.setForeground(new java.awt.Color(238, 151, 83));
        jAgeField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgeField1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(238, 151, 83));
        jLabel23.setText("Second name");

        jLabel24.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(238, 151, 83));
        jLabel24.setText("Course");

        jLabel25.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(238, 151, 83));
        jLabel25.setText("Age");

        jLabel26.setBackground(new java.awt.Color(0, 175, 146));
        jLabel26.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(238, 151, 83));
        jLabel26.setText("             Student Details");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 151, 83), 2));

        jLabel27.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(238, 151, 83));
        jLabel27.setText("Grade");

        jLabel28.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(238, 151, 83));
        jLabel28.setText("Student ID");

        jLabel29.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(238, 151, 83));
        jLabel29.setText("Semester");

        jLabel30.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(238, 151, 83));
        jLabel30.setText("First Name");

        jStudentId2.setForeground(new java.awt.Color(238, 151, 83));
        jStudentId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStudentId2ActionPerformed(evt);
            }
        });

        FirstName.setEditable(false);
        FirstName.setForeground(new java.awt.Color(238, 151, 83));
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        jSecondName.setEditable(false);
        jSecondName.setForeground(new java.awt.Color(238, 151, 83));
        jSecondName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSecondNameActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\images\\search.png")); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jgrade.setEditable(false);
        jgrade.setForeground(new java.awt.Color(238, 151, 83));
        jgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgradeActionPerformed(evt);
            }
        });

        jSemesterField1.setEditable(false);
        jSemesterField1.setForeground(new java.awt.Color(238, 151, 83));
        jSemesterField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSemesterField1ActionPerformed(evt);
            }
        });

        jCourseField1.setEditable(false);
        jCourseField1.setForeground(new java.awt.Color(238, 151, 83));
        jCourseField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCourseField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30)
                            .addComponent(jLabel23)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jAgeField1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jStudentId2)
                            .addComponent(FirstName)
                            .addComponent(jSecondName)
                            .addComponent(jgrade)
                            .addComponent(jSemesterField1)
                            .addComponent(jCourseField1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jStudentId2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jSecondName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jSemesterField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jCourseField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jAgeField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\images\\icons8-left-arrow-50.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 192, 112), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\images\\return.png")); // NOI18N
        jButton3.setText("Return Book");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 192, 112), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(242, 151, 107));
        jLabel8.setFont(new java.awt.Font("Rabar_038", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("       Return Book Here!");
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PageFieldActionPerformed

    private void PriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceFieldActionPerformed

    private void AuthorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorFieldActionPerformed

    private void jBook_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBook_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBook_NameActionPerformed

    private void jBook_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBook_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBook_IdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setVisible(false);
        Home HomePage = new Home();
        HomePage.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgeFieldActionPerformed

    private void jCourseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCourseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCourseFieldActionPerformed

    private void jSemesterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSemesterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSemesterFieldActionPerformed

    private void jgradeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgradeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jgradeFieldActionPerformed

    private void jSecondName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSecondName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSecondName1ActionPerformed

    private void FirstName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName1ActionPerformed

    private void jStudentId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStudentId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStudentId1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jAgeField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgeField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgeField1ActionPerformed

    private void jStudentId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStudentId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStudentId2ActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void jSecondNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSecondNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSecondNameActionPerformed

    private void jgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jgradeActionPerformed

    private void jSemesterField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSemesterField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSemesterField1ActionPerformed

    private void jCourseField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCourseField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCourseField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Delete();
ReturnUpdate();
       

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 setVisible(false);
        Home Page = new Home();
        Page.setVisible(true);    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String s1 = jStudentId2.getText();
        String sql = "select * from Issue where Student_id =?";
        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, jStudentId2.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("Fname");
                FirstName.setText(add1);
                String add2 = rs.getString("Sname");
                jSecondName.setText(add2);
                String add3 = rs.getString("Grade");
                jgrade.setText(add3);
                String add4 = rs.getString("Semester");
                jSemesterField1.setText(add4);
                String add5 = rs.getString("Course");
                jCourseField1.setText(add5);
                String add6 = rs.getString("Age");
                jAgeField1.setText(add6);
               String add7 = rs.getString("Book_id");
                jBook_Id.setText(add7);
                String add8 = rs.getString("Book_name");
                jBook_Name.setText(add8);
                String add9 = rs.getString("Author");
                AuthorField.setText(add9);
                String add10 = rs.getString("Price");
                PriceField.setText(add10);
                String add11 = rs.getString("Pages");
                PageField.setText(add11);
                String add12 = rs.getString("DateOfIssue");
                DateField.setText(add12);
                
                rs.close();
                pst.close();
                JOptionPane.showMessageDialog(null, "Make Sure that the student only took one book!");
            }
            else{
                JOptionPane.showMessageDialog(null, "This Student didn't issue any book yet!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void DateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateFieldActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String s1 = jStudentId2.getText();
        String sql = "select * from Issue where Student_id = ? and Book_id =?";
        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, jStudentId2.getText());       
            pst.setString(2, jBook_Id.getText());

            rs = pst.executeQuery();
            if(rs.next()){
              
                String add8 = rs.getString("Book_name");
                jBook_Name.setText(add8);
                String add9 = rs.getString("Author");
                AuthorField.setText(add9);
                String add10 = rs.getString("Price");
                PriceField.setText(add10);
                String add11 = rs.getString("Pages");
                PageField.setText(add11);
                String add12 = rs.getString("DateOfIssue");
                DateField.setText(add12);
                
                rs.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Make sure that the student issued that book before!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AuthorField;
    private javax.swing.JTextField DateField;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField FirstName1;
    private javax.swing.JTextField PageField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JTextField jAgeField;
    private javax.swing.JTextField jAgeField1;
    private javax.swing.JTextField jBook_Id;
    private javax.swing.JTextField jBook_Name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jCourseField;
    private javax.swing.JTextField jCourseField1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jSecondName;
    private javax.swing.JTextField jSecondName1;
    private javax.swing.JTextField jSemesterField;
    private javax.swing.JTextField jSemesterField1;
    private javax.swing.JTextField jStudentId1;
    private javax.swing.JTextField jStudentId2;
    private javax.swing.JTextField jgrade;
    private javax.swing.JTextField jgradeField;
    // End of variables declaration//GEN-END:variables
}
