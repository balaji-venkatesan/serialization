for i in {1..100000}; do \
  curl -s --location --request POST '127.0.0.1:8080/api/v2/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":'$i',
    "firstName":"firstName",
    "lastName":"lastName",
    "middleName":"middleName",
    "emailId":"emailId",
    "address":"address",
    "countryCode":"countryCode",
    "pinCode":1,
    "mobileNumber":999999999,
    "isActive":false,
    "profilePictureUrl":"profilePictureUrl",
    "description":"Data structures",
    "rating":4,
    "gender": "MALE",
    "isStudent":false
}' > /dev/null
    echo "$i completed"
done
echo #
