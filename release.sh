rm -rf target/release
mkdir target/release
cd target/release
git clone git@github.com:grails-plugins/grails-cache-headers.git
cd grails-cache-headers
grails clean
grails compile

#grails publish-plugin --snapshot --stacktrace
grails publish-plugin --stacktrace