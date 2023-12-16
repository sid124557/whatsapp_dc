package X;

import com.whatsapp.R;

/* renamed from: X.25Z  reason: invalid class name */
public class AnonymousClass25Z {
    public static int A00(AnonymousClass4FG r2) {
        boolean z = C1001059l.A04;
        if (r2 instanceof AnonymousClass1n0) {
            if (z) {
                return R.drawable.msg_status_image_filled_wds;
            }
            return R.drawable.msg_status_image;
        } else if (r2 instanceof C30731mv) {
            if (z) {
                return R.drawable.msg_status_doc_filled_wds;
            }
            return R.drawable.msg_status_doc;
        } else if (r2 instanceof C30981nY) {
            if (z) {
                return R.drawable.msg_status_location_filled_wds;
            }
            return R.drawable.msg_status_location;
        } else if (r2 instanceof C30751mx) {
            return R.drawable.msg_status_gif;
        } else {
            if (!(r2 instanceof AnonymousClass1p7)) {
                return 0;
            }
            if (z) {
                return R.drawable.msg_status_video_filled_wds;
            }
            return R.drawable.msg_status_video;
        }
    }
}
