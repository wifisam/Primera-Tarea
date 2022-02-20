<project>
  <modelVersion>4.0.0</modelVersion>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <version>8.0.28</version>
  <packaging>jar</packaging>

  <name>MySQL Connector/J</name>
  <description>JDBC Type 4 driver for MySQL</description>

  <licenses>
    <license>
      <name>The GNU General Public License, v2 with FOSS exception</name>
      <distribution>repo</distribution>
      <comments>For detailed license information see the LICENSE file in this distribution.</comments>
    </license>
  </licenses>

  <url>http://dev.mysql.com/doc/connector-j/en/</url>

  <scm>
    <connection>scm:git:git@github.com:mysql/mysql-connector-j.git</connection>
    <url>https://github.com/mysql/mysql-connector-j</url>
  </scm>

  <organization>
    <name>Oracle Corporation</name>
    <url>http://www.oracle.com</url>
  </organization>

  <dependencies>
    <dependency>
      <groupId>com.google.protobuf</groupId>
      <artifactId>protobuf-java</artifactId>
      <version>3.11.4</version>
    </dependency>

    <dependency>
      <groupId>com.oracle.oci.sdk</groupId>
      <artifactId>oci-java-sdk-common</artifactId>
      <version>2.3.0</version>
      <optional>true</optional>
    </dependency>
  </dependencies>
</project>
}
