package solutions.questiond363;

public class Date {

  private final int day;
  private final int month;
  private final int year;

  public Date(int day, int month, int year) {
    if (!isValid(day, month, year)) {
      throw new IllegalArgumentException("Invalid date");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean isValid(int day, int month, int year) {

    if (year < 0) {
      return false;
    }

    if (month < 1 || month > 12) {
      return false;
    }

    if (day < 1) {
      return false;
    }

    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        if (day > 31) {
          return false;
        }
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        if (day > 30) {
          return false;
        }
        break;
      default:
        assert month == 2;
        if (day > (isLeapYear() ? 29 : 28)) {
          return false;
        }
    }

    return true;
  }

  private boolean isLeapYear() {
    // Deliberately simplified version of
    // leap year calculation
    return (year % 4 == 0);
  }

  @Override
  public String toString() {
    return day + "/" + month + "/" + year;
  }
}
