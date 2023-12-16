package X;

import android.content.SharedPreferences;

/* renamed from: X.5WV  reason: invalid class name */
public class AnonymousClass5WV {
    public SharedPreferences A00;
    public final C60152y5 A01;

    public static final String A00(int i) {
        if (i == 0) {
            return "golden_box_contact";
        }
        switch (i) {
            case 2:
                return "golden_box_broadcast";
            case 3:
                return "info_screen_contact";
            case 4:
                return "info_screen_group";
            case 5:
                return "info_screen_broadcast";
            case 6:
                return "calls_list";
            case 7:
                return "chats_list";
            case 8:
                return "status_list";
            case 9:
                return "linked_devices";
            case 10:
                return "calling_screen_audio";
            case 11:
                return "calling_screen_video";
            default:
                return "golden_box_group";
        }
    }

    public AnonymousClass5WV(C60152y5 r1) {
        this.A01 = r1;
    }
}
