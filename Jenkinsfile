pipeline
    agent any

    tools {
        maven "mvn"
    }

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/ziberty/selenium_test.git'
                bat "mvn clean test -Dsuite=single.xml"
            }

            post {
                success {
                    publishHTML([allowMissing: false,])
                }
            }
        }
    }