package com.example.android.essentials;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by takeoff on 021 21 Jul 17.
 */

public final class EssentialsContract {

    //The "Content authority" is a name for the entire content provider
    static final String CONTENT_AUTHORITY = "com.example.android.essentials";

    //base of all URI's which apps will use to contact the content provider.
    private static Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    static final String PATH_TAGS = "tags";

    public static final class TagEntry implements BaseColumns {
        public static final String TABLE_NAME = "TAGS";
        public final static String COLUMN_ID = BaseColumns._ID;
        public final static String COLUMN_SUGGESTION = "SUGGEST_COLUMN_TEXT_1";
        public final static String COLUMN_PATH = "PATH";

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_TAGS);

        //vnd.android.cursor.dir/com.example.android.essentials/tags
        static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TAGS;

        //vnd.android.cursor.item/com.example.android.essentials/tags
        static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TAGS;
    }


    public static final class QuestionEntry implements BaseColumns {
        public final static String COLUMN_ID = BaseColumns._ID;
        public final static String COLUMN_NAME = "NAME";
        public final static String COLUMN_FOLDER = "FOLDER";
        public final static String COLUMN_QUESTION = "QUESTION";
    }


    public static final class NotificationsEntry implements BaseColumns {
        public final static String TABLE_NAME = "NOTIFICATIONS";
        public final static String COLUMN_ID = BaseColumns._ID;
        public final static String COLUMN_QUESTION = "QUESTION";
        public final static String COLUMN_RELATIVE_PATH = "RELATIVE_PATH";
        public final static String COLUMN_LEVEL = "LEVEL";
        public final static String COLUMN_TIME_EDITED = "TIME_EDITED";
    }

}
