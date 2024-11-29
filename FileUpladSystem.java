class FileUploadSystem {

    public void uploadFile(String title, String description, String type, String fileName) {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Type: " + type);
        System.out.println("File: " + fileName);
    }

    public static void main(String[] args) {

        FileUploadSystem system = new FileUploadSystem();
        
        String title = "";
        String description = "";
        String type = "";
        String fileName = "";

        system.uploadFile(title, description, type, fileName);
    }
}
