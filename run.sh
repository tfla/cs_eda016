#! /bin/bash
# Launch script for cs_eda016

# Check if cs_eda016.jar exists.
FILE=./cs_eda016.jar
if [ -e $FILE ]; then
	echo "cs_eda016.jar exists, proceeding ..."
else
	echo "cs_eda016.jar doesn't exist, please run install.sh ..."
fi

# Check if ./bin/ exists, if not, create it.
DIR=./bin/
if [ -d $DIR ]; then
	echo "$DIR exists, proceeding ..."
else
	echo "$DIR does't exist, please run install.sh ... "
fi

#Select what to run.
PS3='Choose a folder to use: '
select FOLDER in $( ls $DIR ); do
	PS3='Choose a file to run: '
	select FILE in $( ls $DIR/$FOLDER ); do
		FILE=`echo $FILE | sed 's/\..\{5\}$//'`
		cd $DIR/$FOLDER/
		java -cp ../../cs_eda016.jar: $FILE
		break
	done
	break
done

exit 0
