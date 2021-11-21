for i in {1..50000}; do \
  curl -s --location --request POST '127.0.0.1:8080/api/v1/college'  > /dev/null
    echo "$i completed"
done
echo #
