def call() {
    echo "building the application for $BRANCH_NAME"
    sh 'mvn package'
}
