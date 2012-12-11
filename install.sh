#! /bin/bash
# Build script for cs_eda016

# Check if cs_eda016.jar exists, if not, create it.
FILE=./cs_eda016.jar
if [ -e $FILE ]; then
	echo "cs_eda016.jar exists, proceeding ..."
else
	echo "trying to create cs_eda016.jar ..."
	javac -verbose -d . ./src/cs_eda016/src/se/lth/cs/ptdc/*/*.java
	jar -cvf cs_eda016.jar ./se/lth/cs/ptdc/*/*.class
fi

# Check if ./bin/ exists, if not, create it.
DIR=./bin/
if [ -d $DIR ]; then
	echo "$DIR exists, proceeding ..."
else
	mkdir ./bin
fi

# Function for compiling.
function build() {
if [ -d $1/$2 ]; then
	echo "$1/$2 exists, proceeding ..."
else
	mkdir $1/$2
fi

if [ $2 = inl1 ]; then
	javac -verbose -cp cs_eda016.jar -d $1/$2/ ./src/$2/*.java ./src/lab04/Turtle.java
elif [ $2 = lab05 ]; then
	javac -verbose -cp cs_eda016.jar -d $1/$2/ ./src/$2/*.java ./src/lab04/Turtle.java
elif [ $2 = lab06 ]; then
	javac -verbose -cp cs_eda016.jar -d $1/$2/ ./src/$2/*.java ./src/lab04/Turtle.java
else
	javac -verbose -cp cs_eda016.jar -d $1/$2/ ./src/$2/*.java
fi
}

# Select and build a folder.
PS3='Choose a folder to build: '
select FOLDER in "all" $( ls ./src/ ); do
	if [ $FOLDER = "all" ]; then
		for F in $( ls ./src/ ); do
			build $DIR $F
		done
	elif [ $FOLDER != "all" ]; then
		build $DIR $FOLDER
	fi
	break
done

exit 0
