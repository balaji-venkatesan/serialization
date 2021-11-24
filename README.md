# Java serialization

## _Redis usage of generic jackson serializer (158Mb space was used for 50k keys)_


<img width="604" alt="Screenshot 2021-11-21 at 6 16 31 PM" src="https://user-images.githubusercontent.com/34711372/142774475-06a796a4-3897-428f-83b4-2eefc90208df.png">


## _Redis usage of protobuf serializer (48Mb space was used for the same 50K keys)_

<img width="511" alt="Screenshot 2021-11-21 at 9 51 04 PM" src="https://user-images.githubusercontent.com/34711372/142774476-d72a329f-7b4a-491b-9e43-0718b848d209.png">


## How does GenericJackson2Json serialization work:

When a java POJO is serialized, the following are the steps involved
- Add metadata of the class associated with the object, meta information will be the entire package name and the class name.
- If there are any superclasses, metadata will be added recursively until we find the Object class
- The purpose of adding the package name and the class name as meta is to help in deserialization.


<img width="1439" alt="Screenshot 2021-11-24 at 9 32 41 PM" src="https://user-images.githubusercontent.com/34711372/143275484-215c1fc8-93ee-439f-a601-f6b3988d8a46.png">

- In the above image, we can see the metadata information that is appended as part of GenericJackson2Json serializer, such as @class,  java.util.ImmutableCollections.List.
- In this example,  College contains  List<Teacher> and every teacher object contains List<Subjects>, so for every teacher and student,  this meta-information will be occupying additional space.

  
 ## How does ProtoBuf serialization work:
  
  refer: https://developers.google.com/protocol-buffers
  
  In protocol buffers, the transmission of data is done in binary format. Because of this it is faster and saves space.
The protobuf (protocol buffers) consist of context file (.proto file)

  > {
  > string name = 1;
  > string address = 2; 
  > }
  
  <img width="1440" alt="Screenshot 2021-11-24 at 10 06 15 PM" src="https://user-images.githubusercontent.com/34711372/143278572-b697b071-fefa-4932-bccb-9e0859a87e7e.png">
  
  The protobuf doesn’t main the order, so field numbers are used for deserializtion.
  
  Another major advantage of using protobuf is that, the SDK will be able to generate code for other languages as well. 
  
  TODO:
  Add a golang example, of fetching values from redis using prtobuf
