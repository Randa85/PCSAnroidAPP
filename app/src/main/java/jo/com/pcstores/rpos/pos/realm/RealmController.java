package jo.com.pcstores.rpos.pos.realm;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;


import jo.com.pcstores.rpos.pos.Classes.Items;

public class RealmController {
//    private static RealmController instance;
//    private final Realm realm;
//
//    public RealmController(Application application) {
//        realm = Realm.getDefaultInstance();
//    }
//
//    public static RealmController with(Fragment fragment) {
//
//        if (instance == null) {
//            instance = new RealmController(fragment.getActivity().getApplication());
//        }
//        return instance;
//    }
//
//    public static RealmController with(Activity activity) {
//
//        if (instance == null) {
//            instance = new RealmController(activity.getApplication());
//        }
//        return instance;
//    }
//
//    public static RealmController with(Application application) {
//
//        if (instance == null) {
//            instance = new RealmController(application);
//        }
//        return instance;
//    }
//
//    public static RealmController getInstance() {
//
//        return instance;
//    }
//
//    public Realm getRealm() {
//
//        return realm;
//    }
//
//    //Refresh the realm istance
//    public void refresh() {
//
//        realm.refresh();
//    }
//
//    //clear all objects from Book.class
//    public void clearAll() {
//
//        realm.beginTransaction();
//        realm.clear(Items.class);
//        realm.commitTransaction();
//    }
//
//    //find all objects in the Book.class
//    public RealmResults<Items> getItems() {
//
//        return realm.where(Items.class).findAll();
//    }
//
//    //query a single item with the given id
//    public Items getItem(String id) {
//
//        return realm.where(Items.class).equalTo("itemId", id).findFirst();
//    }
//
//    //check if Book.class is empty
//    public boolean hasItems() {
//
//        return !realm.allObjects(Items.class).isEmpty();
//    }

}

