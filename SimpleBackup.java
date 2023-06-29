import java.io.File;

/**
 * Класс SimpleBackup реализует приложение, которое копирует файлы из одной директории в другую. В
 * точке входа в приложение (метод main) создается объект класса DirectoryCopier с указанием
 * исходной и целевой директорий. Затем вызывается метод copyDirectory(), который выполняет
 * копирование файлов.
 */
public class SimpleBackup {

  /**
   * Точка входа в приложение.
   *
   * @param args Аргументы командной строки. В данном приложении не используются.
   */
  public static void main(String[] args) {
    // Создание объекта File для исходной директории
    File sourceFolder = new File("./soursceDirectory");
    // Создание объекта File для директории резервного копирования
    File backupFolder = new File("./backup");

    // Создание объекта класса DirectoryCopier
    DirectoryCopier copier = new DirectoryCopier(sourceFolder, backupFolder);
    // Выполнение копирования файлов
    copier.copyDirectory();
  }
}
