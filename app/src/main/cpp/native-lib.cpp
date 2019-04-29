#include <jni.h>
#include <string>
#include <vector>
#include <list>
//ist <int> gqlist1, gqlist2;

class User{
private:
    jstring firstName;
    jstring lastName;
    jint id;
    jdouble credit;
    jint yearGroup;
    jstring password;

    void setCredit(jdouble credit) {
        this->credit = credit;
    }

    void setYearGroup(jint yearGroup) {
        this->yearGroup = yearGroup;
    }

public:
    User(jstring firstName, jstring lastName, jint id, jdouble credit, jint yearGroup, jstring password){
        this->firstName = firstName;
        this->lastName = lastName;
        this->id = id;
        this->credit = credit;
        this->yearGroup = yearGroup;
        this->password = password;
    }

    //virtual ~User();

    jstring getFirstName(){
        return this->firstName;
    }

    jstring getLastName(){
        return this->lastName;
    }

    jint getId(){
        return this->id;
    }

    jdouble getCredit(){
        return this->credit;
    }

    jint getYearGroup(){
        return this->yearGroup;
    }

    jstring getPassword(){
        return this->password;
    }

    void setFirstName(jstring firstName){
        this->firstName = firstName;
    }

    void setLastName(jstring lastName) {
        this->lastName = lastName;
    }

    void setPassword(jstring password) {
        this->password = password;
    }
};

extern "C"
JNIEXPORT jstring JNICALL Java_com_example_myapplication_studentRegisterPage_getFirstName(
        JNIEnv *env, jobject instance, jstring firstName)
{
    ;
}




extern "C"
JNIEXPORT jint JNICALL Java_com_example_myapplication_studentRegisterPage_add
        (JNIEnv *env, jobject instance, jint a, jint b)
{
    return a+b;
}
