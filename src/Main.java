import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Attendance> attendanceList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Submit Absence");
            System.out.println("2. View History");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            String input = scanner.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Pilihan harus berupa angka. Silakan coba lagi.");
                continue;
            }

        switch (choice) {
            case 1:
                System.out.println("Masukan nama");
                String name = scanner.nextLine();
                    if (name.trim().isEmpty()) {
                        System.out.println("Nama tidak boleh kosong. Silakan coba lagi.");
                        break;
                    }

                    System.out.println("Status Kehadiran (Hadir/Izin/Sakit):");
                    String status = scanner.nextLine();
                    boolean validStatus = status.equalsIgnoreCase("Hadir") ||
                                        status.equalsIgnoreCase("Izin") ||
                                        status.equalsIgnoreCase("Sakit");
                    
                    if (!validStatus) {
                        System.out.println("Status harus berupa 'Hadir', 'Izin', atau 'Sakit'. Silakan coba lagi.");
                        break;
                    }

                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String date = now.format(formatter);

                    Attendance attendance = new Attendance(name, date, status);
                    attendanceList.add(attendance);
                    System.out.println("Data absensi berhasil ditambahkan.");
                    break;

            case 2:
                if (attendanceList.isEmpty()) {
                    System.out.println("Belum ada data absensi.");
                    } else {
                        for (int i = 0; i < attendanceList.size(); i++) {
                            Attendance item = attendanceList.get(i);

                            System.out.println(
                                (i + 1) + ". " + item.getName() + " | " + item.getDate() + " | " + item.getStatus()
                            );
                            }
                        }
                        break;
            case 3:
                running = false;
                    System.out.println("program selesai.");
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    scanner.close();
    }
}