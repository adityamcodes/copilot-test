#good, more robust questions -----------------------------------------------------------

#Filter out tweets that don't have a location and dont have an id and are not retweets
def 


# create a client to access s3 bucket using boto3
def create_client():
    """create a client to access s3 bucket using boto3"""
    
    # create a s3 bucket using boto3
    s3 = boto3.client('s3')
    
    # upload file to s3 bucket named "test" 
    s3.upload_file('test.txt', 'test', 'test.txt')
    
    


## almost correct answers
# preprocess a dataset for machine learning. categorical data is converted to numerical data
# and missing values are replaced with the mean of the column
def 



#preprocess a pandas dataframe for machine learning. remove columns that are more than 80% missing. categorical data is converted to numerical data. numerical data columns are normalized. use PCA for dimensionality reduction of the features to remove redundant features.
def 
    
    


# good, simple requests -> each provides a few right & wrong answers -----------------------------------------------------------

# 

## some wrong, some right
# calculate the cosine similarity between two strings
def 


## some wrong, some right
# calculate the jaccard similarity between two strings
def 


# normalize a df column
def 


#limited examples-----------------------------------------------------------


#no luck-----------------------------------------------------------

# standadize a df column
def 



# Create an image classification model in keras using the VGG16 architecture. Freeze the hidden layers.
# def create_vgg16_model():
    
    
def create_model():
    """create an mask RCNN model in keras for object detection and image segmentation. Create model layers, loss function, optimizer, and metrics."""
    