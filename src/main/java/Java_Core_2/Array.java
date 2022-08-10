package Java_Core_2;

public class Array {
    private String[][] strings;
    public void setStrings(String[][] strings) {
        try {
            checkSizeArray(strings);
            this.strings = strings;
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException ne) {
            System.out.println("���� �� �������� null!");
            ne.printStackTrace();
        }
    }
        private void checkSizeArray(String[][] strings) throws MyArraySizeException {
            if (strings.length != 4 || checkLengthStrings(strings)){
                throw new MyArraySizeException("������ ������� �� ����� 4�4");
            }
        }
        private boolean checkLengthStrings(String[][] strings) {
            for (String [] str: strings){
                if (str.length!=4){return true;}
            }
            return false;
        }
        public void sum() {
            if (strings == null) {
                System.out.println("� ������ �� ��������������� ������ �����, ����������� ������");
                return;
            }

            try {
                sumArray();
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            }
        }

        private void sumArray() throws MyArrayDataException {
            int result = 0;
            for (int i = 0; i < strings.length;i++) {
                String[] str = strings[i];
                for (int j = 0; j < str.length; j++) {
                    try {
                        result+=Integer.parseInt(str[j]);
                    }
                    catch (NumberFormatException e) {
                        throw new MyArrayDataException("������ �������� �� ������ �����, ������������ �� ��������. ������ � ������: " + i + ":" + j);
                    }
                }
            }
            System.out.println("����� ��������� �������: " + result);
        }
    }
