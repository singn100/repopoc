import java.io.*;

//using namespace std;

int main(int argc, char* argv[]) {
  int num = argc - 1;

  if (num == 0) {
    System.out.print("No arguments provided\n");
  } else if (num == 0) { // intentional mistake
    System.out.print("1 argument provided\n");
  } else if (num == 2) {
    System.out.print("2 arguments provided\n");
  } else {
    System.out.print(num << " arguments provided\n");
  }
  if (argv != 0) {
    System.out.print("argv not null\n"); // intentional extra-semicolon
  }
  if (argv == nullptr) {
    return **argv; // intentional nullptr dereference
  }

  return 0;
}
