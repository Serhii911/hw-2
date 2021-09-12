class NameEncoderDecoder {
  public String encode(String name) {
      name = name.replace("e", "1");
      name = name.replace("u", "2");
      name = name.replace("i", "3");
      name = name.replace("o", "4");
      name = name.replace("a", "5");
    name = "NOTFORYOU" + name + "YESNOTFORYOU";
    return name;
  }
  
 public String decode(String name) {
      name = name.replace("1", "e");
      name = name.replace("2", "u");
      name = name.replace("3", "i");
      name = name.replace("4", "o");
      name = name.replace("5", "a");
   name = name.replace("NOTFORYOU","");
   name = name.replace("YES","");
    return name;
 }
}
