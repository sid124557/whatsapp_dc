package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5fC  reason: invalid class name and case insensitive filesystem */
public class C109795fC implements View.OnDragListener {
    public C94894sF A00;
    public final Activity A01;
    public final C111485iA A02;
    public final C56612sH A03;
    public final AnonymousClass4FV A04;
    public final C988953q A05;

    public C109795fC(Context context, C111485iA r3, C56612sH r4, AnonymousClass4FV r5, C988953q r6) {
        this.A02 = r3;
        this.A01 = C111095hX.A02(context);
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        String str;
        ClipData.Item itemAt;
        String str2;
        int action = dragEvent.getAction();
        if (action == 1) {
            view.setVisibility(0);
            view.setBackgroundColor(-2134061876);
            C94894sF r1 = new C94894sF();
            this.A00 = r1;
            r1.A07 = C18280x3.A0Y();
            this.A00.A04 = Long.valueOf(System.currentTimeMillis());
            return true;
        } else if (action == 3) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.A01.requestDragAndDropPermissions(dragEvent);
            }
            C94694rl r4 = new C94694rl();
            C94894sF r5 = this.A00;
            r4.A04 = r5.A07;
            if (dragEvent.getClipData() != null) {
                Long A0m = AnonymousClass0x9.A0m(dragEvent.getClipData().getItemCount());
                r5.A05 = A0m;
                r4.A01 = A0m;
                HashSet A0K = AnonymousClass002.A0K();
                for (int i = 0; i < dragEvent.getClipData().getItemCount(); i++) {
                    Uri uri = dragEvent.getClipData().getItemAt(i).getUri();
                    if (uri != null) {
                        byte A002 = this.A05.A00(uri);
                        if (A002 == -1) {
                            str2 = "invalid";
                        } else if (A002 == 9) {
                            str2 = "document";
                        } else if (A002 == 13) {
                            str2 = "gif";
                        } else if (A002 == 1) {
                            str2 = "photo";
                        } else if (A002 == 2) {
                            str2 = "audio";
                        } else if (A002 == 3) {
                            str2 = "video";
                        } else if (A002 != 4) {
                            str2 = "none";
                        } else {
                            str2 = "contact";
                        }
                        A0K.add(str2);
                    }
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                Iterator it = A0K.iterator();
                while (it.hasNext()) {
                    A0o.append(AnonymousClass001.A0m(it));
                    A0o.append(",");
                }
                String obj = A0o.toString();
                r5.A06 = obj;
                r4.A03 = obj;
            }
            C111485iA r12 = this.A02;
            ClipData clipData = dragEvent.getClipData();
            r12.A00 = r4;
            if (clipData != null && clipData.getDescription() != null) {
                if (!clipData.getDescription().hasMimeType("text/plain") && !clipData.getDescription().hasMimeType("text/html")) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
                        ClipData.Item itemAt2 = clipData.getItemAt(i2);
                        if (!(itemAt2 == null || itemAt2.getUri() == null)) {
                            A0s.add(itemAt2.getUri());
                        }
                    }
                    Iterator it2 = A0s.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            r12.A00(A0s);
                            break;
                        }
                        if (r12.A0B.A00(C86664Kz.A0c(it2)) == 9) {
                            AnonymousClass3ZH A07 = r12.A05.A07(r12.A0A);
                            AnonymousClass5ZU r7 = r12.A06;
                            Activity activity = r12.A02;
                            AnonymousClass5Y0 r9 = r12.A08;
                            AnonymousClass29P.A00(activity, new C1891590f(r12, 4), new C1893490y(r12, 2, A0s), new C1891190b(r12, 29), r7, A07, r9, A0s, (Map) null).show();
                            break;
                        }
                    }
                } else {
                    if (clipData.getItemCount() != 1 || (itemAt = clipData.getItemAt(0)) == null || itemAt.getText() == null) {
                        str = "";
                    } else {
                        str = itemAt.getText().toString();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        r12.A0C.setText(str);
                    }
                }
            } else {
                r12.A03.A0H(R.string.f11nameremoved, 0);
                C94694rl r3 = r12.A00;
                r3.A00 = Boolean.FALSE;
                r3.A02 = "clip_data_or_clip_description_null";
                r12.A09.BhD(r3);
            }
            this.A00.A00 = Long.valueOf(System.currentTimeMillis());
            return true;
        } else if (action == 4) {
            view.setBackgroundColor(0);
            C94894sF r32 = this.A00;
            r32.A01 = Long.valueOf(System.currentTimeMillis());
            this.A04.BhD(r32);
            return true;
        } else if (action == 5) {
            view.setBackgroundColor(-2131824914);
            this.A00.A02 = Long.valueOf(System.currentTimeMillis());
            return true;
        } else if (action != 6) {
            return false;
        } else {
            view.setBackgroundColor(-2134061876);
            this.A00.A03 = Long.valueOf(System.currentTimeMillis());
            return true;
        }
    }
}
