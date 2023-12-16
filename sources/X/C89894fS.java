package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.Editable;
import android.view.View;
import android.widget.ImageButton;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.conversation.CapturePictureOrVideoDialogFragment;
import com.whatsapp.events.EventCreationBottomSheet;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4fS  reason: invalid class name and case insensitive filesystem */
public final class C89894fS extends AnonymousClass5c4 implements AnonymousClass64L {
    public int A00;
    public AnonymousClass4Rp A01;
    public C89214c6 A02;
    public final C009707r A03;
    public final C55682qk A04;
    public final AnonymousClass4FU A05;
    public final C64393Dh A06;
    public final C69263Wi A07;
    public final C181568my A08;
    public final C56972sr A09;
    public final AnonymousClass5Ul A0A;
    public final C621033m A0B;
    public final C105035Th A0C;
    public final C620433g A0D;
    public final AnonymousClass5XF A0E;
    public final C50482iF A0F;
    public final AnonymousClass2PX A0G;
    public final C56962sq A0H;
    public final ConversationCommunityViewModel A0I;
    public final C44772Xk A0J;
    public final C185428td A0K;
    public final C100275Ag A0L;
    public final C113895mA A0M;
    public final C85014Ep A0N;
    public final C56512s6 A0O;
    public final C620633i A0P;
    public final AnonymousClass5ZR A0Q;
    public final AnonymousClass33p A0R;
    public final C61072zf A0S;
    public final AnonymousClass1VX A0T;
    public final AnonymousClass4FV A0U;
    public final AnonymousClass5MZ A0V;
    public final C95814uZ A0W;
    public final C28071fd A0X;
    public final C48682fI A0Y;
    public final MentionableEntry A0Z;
    public final AnonymousClass9Tp A0a;
    public final C194369Sp A0b;
    public final C49632gq A0c;
    public final C60152y5 A0d;
    public final AnonymousClass4BJ A0e;
    public final C29321id A0f;
    public final C84634Dc A0g = new C124136Bc(this, 0);
    public final C105895Wv A0h;
    public final AnonymousClass5XO A0i;
    public final C989053r A0j;
    public final boolean A0k;

    public void A00() {
        AnonymousClass1VX r2 = this.A0T;
        C009707r r7 = this.A03;
        Intent A0L2 = RequestPermissionActivity.A0L(r7, this.A0Q, r2, 31);
        if (A0L2 != null) {
            r7.startActivityForResult(A0L2, 31);
        } else if (this.A0O.A08(this.A0N)) {
            C69263Wi r5 = this.A07;
            C64393Dh r9 = this.A06;
            C60152y5 r8 = this.A0d;
            r2.A0N(2614);
            Intent putExtra = AnonymousClass0x9.A09("android.media.action.IMAGE_CAPTURE").putExtra("output", C627536m.A01(r7, C106275Yh.A00(r9, r8, C633138t.A0C, ".jpg", 1)));
            putExtra.setFlags(2);
            try {
                r7.startActivityForResult(putExtra, 23);
            } catch (ActivityNotFoundException e) {
                Log.e("mediafileutils/start-activity ", e);
                r5.A0H(R.string.f11nameremoved, 0);
            }
        }
    }

    public void A01() {
        AnonymousClass1VX r2 = this.A0T;
        C009707r r4 = this.A03;
        Intent A0L2 = RequestPermissionActivity.A0L(r4, this.A0Q, r2, 32);
        if (A0L2 != null) {
            r4.startActivityForResult(A0L2, 32);
        } else if (this.A0O.A08(this.A0N)) {
            C69263Wi r3 = this.A07;
            r2.A0N(2614);
            try {
                r4.startActivityForResult(AnonymousClass0x9.A09("android.media.action.VIDEO_CAPTURE"), 4);
            } catch (ActivityNotFoundException e) {
                Log.e("mediafileutils/start-activity ", e);
                r3.A0H(R.string.f11nameremoved, 0);
            }
        }
    }

    public final void A02() {
        int i;
        String str;
        if (this.A0Q.A03(C107035aa.A03()) != 0) {
            AnonymousClass1VX r5 = this.A0T;
            C009707r r4 = this.A03;
            if (r4.isFinishing()) {
                Log.d("request/permission/activity/storage passed activity is finishing: do nothing");
                return;
            }
            if (!C107385bE.A08()) {
                i = R.string.f11nameremoved;
            } else {
                boolean A0A2 = C107385bE.A0A();
                i = R.string.f11nameremoved;
                if (!A0A2) {
                    i = R.string.f11nameremoved;
                }
            }
            r4.startActivityForResult(RequestPermissionActivity.A0Y(r4, r5, R.string.f11nameremoved, i), 807);
        } else if (this.A0O.A08(this.A0N)) {
            C113895mA r1 = this.A0M;
            AnonymousClass33p r0 = this.A0R;
            C95814uZ r9 = this.A0W;
            C107465bM.A08(r1, r0, r9);
            C69263Wi r7 = this.A07;
            AnonymousClass5XO r8 = this.A0i;
            C009707r r6 = this.A03;
            this.A0T.A0N(2614);
            boolean z = true;
            if (r8 == null || !C154437dA.A00(r8.A00)) {
                z = false;
            }
            Intent A072 = C18320x8.A07();
            String packageName = r6.getPackageName();
            if (z) {
                str = "com.whatsapp.documentpicker.AudioPickerBottomSheetActivity";
            } else {
                str = "com.whatsapp.audiopicker.AudioPickerActivity";
            }
            C86604Kt.A13(A072, r9, packageName, str);
            try {
                r6.startActivityForResult(A072, 5);
                if (r8 != null) {
                    r8.A01(r6);
                }
            } catch (ActivityNotFoundException e) {
                Log.e("mediafileutils/start-activity ", e);
                r7.A0H(R.string.f11nameremoved, 0);
            }
        }
    }

    public final void A03() {
        C27991fJ A052;
        boolean z;
        Intent A072;
        String packageName;
        String str;
        C624134x quotedMessage = this.A0K.getQuotedMessage();
        boolean A0Y2 = this.A09.A0Y();
        Bundle bundle = null;
        C009707r r4 = this.A03;
        C95814uZ r7 = this.A0W;
        if (!A0Y2) {
            if (quotedMessage != null) {
                bundle = C627636p.A02(quotedMessage.A1J);
            }
            A052 = C627636p.A05(quotedMessage);
            z = this.A0k;
            boolean A002 = C154437dA.A00(this.A0T);
            A072 = C18320x8.A07();
            packageName = r4.getPackageName();
            if (A002) {
                str = "com.whatsapp.contact.picker.PhoneContactsSelectorBottomSheet";
            } else {
                str = "com.whatsapp.contact.picker.PhoneContactsSelector";
            }
        } else {
            if (quotedMessage != null) {
                bundle = C627636p.A02(quotedMessage.A1J);
            }
            A052 = C627636p.A05(quotedMessage);
            z = this.A0k;
            boolean A003 = C154437dA.A00(this.A0T);
            A072 = C18320x8.A07();
            packageName = r4.getPackageName();
            if (A003) {
                str = "com.whatsapp.contact.picker.ContactsAttachmentSelectorBottomSheet";
            } else {
                str = "com.whatsapp.contact.picker.ContactsAttachmentSelector";
            }
        }
        C627336j.A0E(A072, r7, packageName, str);
        A072.putExtra("quoted_message", bundle);
        C627336j.A0D(A072, A052, "quoted_group_jid");
        A072.putExtra("has_number_from_url", z);
        r4.startActivityForResult(A072, 9);
        this.A0i.A01(r4);
    }

    public final void A05() {
        Intent A072;
        String packageName;
        String str;
        C009707r r6 = this.A03;
        View currentFocus = r6.getCurrentFocus();
        if (currentFocus != null) {
            this.A0h.A02(currentFocus);
        }
        C624134x quotedMessage = this.A0K.getQuotedMessage();
        boolean A052 = this.A0X.A05(r6);
        long j = 0;
        Context applicationContext = r6.getApplicationContext();
        String A073 = C627336j.A07(this.A0W);
        if (A052) {
            if (quotedMessage != null) {
                j = quotedMessage.A1L;
            }
            String A074 = C627336j.A07(C627636p.A05(quotedMessage));
            boolean z = this.A0k;
            boolean A002 = C154437dA.A00(this.A0T);
            A072 = C18320x8.A07();
            A072.putExtra("jid", A073);
            A072.putExtra("quoted_message_row_id", j);
            A072.putExtra("quoted_group_jid", A074);
            A072.putExtra("has_number_from_url", z);
            packageName = applicationContext.getPackageName();
            if (A002) {
                str = "com.whatsapp.location.LocationPicker2BottomSheet";
            } else {
                str = "com.whatsapp.location.LocationPicker2";
            }
        } else {
            if (quotedMessage != null) {
                j = quotedMessage.A1L;
            }
            String A075 = C627336j.A07(C627636p.A05(quotedMessage));
            boolean z2 = this.A0k;
            boolean A003 = C154437dA.A00(this.A0T);
            A072 = C18320x8.A07();
            A072.putExtra("jid", A073);
            A072.putExtra("quoted_message_row_id", j);
            A072.putExtra("quoted_group_jid", A075);
            A072.putExtra("has_number_from_url", z2);
            packageName = applicationContext.getPackageName();
            if (A003) {
                str = "com.whatsapp.location.LocationPickerBottomSheet";
            } else {
                str = "com.whatsapp.location.LocationPicker";
            }
        }
        A072.setClassName(packageName, str);
        r6.startActivityForResult(A072, 802);
        this.A0i.A01(r6);
    }

    public final void A06() {
        if (this.A0Q.A04() == C997357z.DENIED) {
            RequestPermissionActivity.A0i(this.A03, this.A0T, 809);
        } else if (this.A0O.A08(this.A0N)) {
            A08();
        }
    }

    public final void A07() {
        if (A0G(810) && this.A0O.A08(this.A0N)) {
            C69263Wi r7 = this.A07;
            C009707r r6 = this.A03;
            this.A0T.A0N(2614);
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            try {
                r6.startActivityForResult(intent, 21);
            } catch (ActivityNotFoundException e) {
                Log.e("mediafileutils/start-activity ", e);
                r7.A0H(R.string.f11nameremoved, 0);
            }
        }
    }

    public final void A08() {
        long j;
        C624134x quotedMessage = this.A0K.getQuotedMessage();
        if (quotedMessage == null) {
            j = 0;
        } else {
            j = quotedMessage.A1L;
        }
        C27991fJ A052 = C627636p.A05(quotedMessage);
        MentionableEntry mentionableEntry = this.A0Z;
        String stringText = mentionableEntry.getStringText();
        List mentions = mentionableEntry.getMentions();
        int i = 1;
        if (this.A00 == 5) {
            i = 20;
        }
        this.A0V.A00(this.A03, this.A0W, A052, stringText, mentions, i, C86664Kz.A0I(this.A0T), j, this.A0k, true, false);
    }

    public void A09(int i) {
        long j;
        C49632gq r6 = this.A0c;
        int i2 = 2;
        if (i != 1) {
            int i3 = 3;
            if (i != 2) {
                i2 = 4;
                if (i != 3) {
                    i3 = 5;
                    if (i != 4) {
                        i2 = 6;
                        if (i != 5) {
                            i2 = 1;
                        }
                    }
                }
            }
            i2 = i3;
        }
        if (r6.A01 != 0 && Math.random() * ((double) 5) < 1.0d) {
            Log.d("cameraopentracker/start");
            r6.A01 = 1;
            r6.A02 = SystemClock.elapsedRealtime();
            r6.A00 = i2;
        }
        AnonymousClass1VX r4 = this.A0T;
        C009707r r2 = this.A03;
        Intent A0L2 = RequestPermissionActivity.A0L(r2, this.A0Q, r4, 30);
        if (A0L2 != null) {
            int i4 = 804;
            if (i != 2) {
                i4 = 803;
                if (i != 3) {
                    i4 = 805;
                    if (i != 5) {
                        i4 = 30;
                    }
                }
            }
            r2.startActivityForResult(A0L2, i4);
        } else if (this.A0O.A08(this.A0N)) {
            if (this.A0S.A02() < C86624Kv.A05(r4, 3658)) {
                AnonymousClass35X.A05(r2, this.A05, this.A0U, 5);
            } else {
                C56962sq r0 = this.A0H;
                C95814uZ r10 = this.A0W;
                if (C86614Ku.A1X(r0, r10)) {
                    C621433s.A01(r2, 106);
                } else {
                    C624134x quotedMessage = this.A0K.getQuotedMessage();
                    if (quotedMessage == null) {
                        j = 0;
                    } else {
                        j = quotedMessage.A1L;
                    }
                    String A072 = C627336j.A07(C627636p.A05(quotedMessage));
                    boolean z = this.A0k;
                    MentionableEntry mentionableEntry = this.A0Z;
                    String stringText = mentionableEntry.getStringText();
                    List mentions = mentionableEntry.getMentions();
                    Intent A073 = C18320x8.A07();
                    C627336j.A0E(A073, r10, r2.getPackageName(), "com.whatsapp.camera.CameraActivity");
                    A073.putExtra("quoted_message_row_id", j);
                    A073.putExtra("quoted_group_jid", A072);
                    A073.putExtra("chat_opened_from_url", z);
                    A073.putExtra("camera_origin", i);
                    A073.putExtra("android.intent.extra.TEXT", stringText);
                    A073.putExtra("mentions", C624435a.A01(mentions));
                    r2.startActivityForResult(A073, 806);
                    this.A0M.A04();
                    return;
                }
            }
        }
        r6.A00();
    }

    public void A0A(int i, String str) {
        AnonymousClass4Rp r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
        }
        this.A0b.A00(this.A0W, this.A0K.getQuotedMessage(), this.A0Z.getStringText(), str, i, false);
        this.A0i.A01(this.A03);
    }

    public void A0B(Uri uri, Byte b, int i) {
        if (C86614Ku.A1X(this.A0H, this.A0W)) {
            C621433s.A01(this.A03, 106);
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        if (uri != null) {
            A0s.add(uri);
        }
        A0D(b, A0s, i);
    }

    public void A0C(View view, int i) {
        View view2 = view;
        C009707r r3 = this.A03;
        if (C621433s.A03(r3)) {
            Log.i("conversation/attachment-popup - activity is ending, bailing...");
            return;
        }
        AnonymousClass1VX r9 = this.A0T;
        if (C86614Ku.A1Y(r9)) {
            C105895Wv r2 = this.A0h;
            C009707r r11 = r3;
            ImageButton imageButton = (ImageButton) view2;
            C89214c6 r10 = new C89214c6(r11, imageButton, this.A04, this.A08, this.A0Z, this.A0P, this.A0R, r9, r2);
            r10.A0A(this.A0I, this, this.A0W);
            this.A02 = r10;
            return;
        }
        C69263Wi r5 = this.A07;
        C105895Wv r112 = this.A0h;
        C95814uZ r102 = this.A0W;
        int i2 = i;
        AnonymousClass4Rp r22 = new AnonymousClass4Rp(r3, view2, r5, this.A0I, this, this.A0P, r9, r102, r112, AnonymousClass000.A1U(i2, 5));
        this.A01 = r22;
        this.A00 = i2;
        r22.A06(r3);
    }

    public void A0E(String str, boolean z) {
        String str2;
        long j;
        String str3;
        AnonymousClass1VX r1 = this.A0T;
        if (!C86614Ku.A1Y(r1)) {
            AnonymousClass4Rp r0 = this.A01;
            C626936e.A06(r0);
            r0.dismiss();
        }
        switch (str.hashCode()) {
            case -1367751899:
                if (str.equals("camera")) {
                    if (z) {
                        this.A05.Boo(new CapturePictureOrVideoDialogFragment());
                        return;
                    }
                    A09(this.A00);
                    return;
                }
                break;
            case -1275762953:
                str2 = "quick reply";
                break;
            case -309474065:
                str2 = "product";
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    if (z) {
                        A07();
                        return;
                    } else {
                        A06();
                        return;
                    }
                }
                break;
            case 3446719:
                if (str.equals("poll")) {
                    Editable text = this.A0Z.getText();
                    String str4 = "";
                    if (text != null) {
                        int A002 = AnonymousClass5VB.A00(text);
                        int A0N2 = r1.A0N(1406);
                        if (A002 > A0N2) {
                            CharSequence A012 = C106815aD.A01(text, 0, text.length(), A0N2);
                            if (A012 != null) {
                                str4 = A012.toString();
                            }
                        } else {
                            str4 = text.toString();
                        }
                    }
                    AnonymousClass5XO r7 = this.A0i;
                    C009707r r6 = this.A03;
                    C105895Wv r2 = this.A0h;
                    C95814uZ r8 = this.A0W;
                    C624134x quotedMessage = this.A0K.getQuotedMessage();
                    View currentFocus = r6.getCurrentFocus();
                    if (currentFocus != null) {
                        r2.A02(currentFocus);
                    }
                    if (quotedMessage == null) {
                        j = 0;
                    } else {
                        j = quotedMessage.A1L;
                    }
                    boolean A003 = C154437dA.A00(r7.A00);
                    Intent A072 = C18320x8.A07();
                    String packageName = r6.getPackageName();
                    if (A003) {
                        str3 = "com.whatsapp.polls.PollCreatorBottomSheetActivity";
                    } else {
                        str3 = "com.whatsapp.polls.PollCreatorActivity";
                    }
                    C627336j.A0E(A072, r8, packageName, str3);
                    A072.putExtra("quoted_message_row_id", j);
                    if (str4 != null) {
                        A072.putExtra("entry_string_text", str4);
                    }
                    r6.startActivityForResult(A072, 858);
                    r7.A01(r6);
                    return;
                }
                break;
            case 3529462:
                if (str.equals("shop")) {
                    AnonymousClass2PX r12 = this.A0G;
                    C24261Ws r3 = new C24261Ws();
                    r3.A00 = 11;
                    r12.A02.Bh7(r3, new AnonymousClass5ZC(1, 1), false);
                    return;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    A02();
                    return;
                }
                break;
            case 96891546:
                if (str.equals("event")) {
                    AnonymousClass4FU r4 = this.A05;
                    C95814uZ r22 = this.A0W;
                    C624134x quotedMessage2 = this.A0K.getQuotedMessage();
                    C162457s7.A0J(r22, 0);
                    Bundle A082 = AnonymousClass002.A08();
                    AnonymousClass0x2.A0v(A082, r22, "jid");
                    if (quotedMessage2 != null) {
                        A082.putLong("extra_quoted_message_row_id", quotedMessage2.A1L);
                    }
                    EventCreationBottomSheet eventCreationBottomSheet = new EventCreationBottomSheet();
                    eventCreationBottomSheet.A0u(A082);
                    r4.Boo(eventCreationBottomSheet);
                    return;
                }
                break;
            case 106006350:
                str2 = "order";
                break;
            case 861720859:
                if (str.equals("document")) {
                    A04();
                    return;
                }
                break;
            case 951526432:
                if (str.equals("contact")) {
                    if (!this.A0J.A00()) {
                        RequestPermissionActivity.A0d(this.A03, R.string.f11nameremoved, R.string.f11nameremoved, false);
                        return;
                    } else {
                        A03();
                        return;
                    }
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    C009707r r5 = this.A03;
                    AnonymousClass5ZR r42 = this.A0Q;
                    AnonymousClass33p r02 = this.A0R;
                    String[] strArr = C622534h.A09;
                    if ((!RequestPermissionActivity.A0t(r02, strArr) && !RequestPermissionActivity.A0p(r5, strArr)) || RequestPermissionActivity.A0n(r5, r42, R.string.f11nameremoved, 0, 801)) {
                        A05();
                        return;
                    }
                    return;
                }
                break;
        }
        if (str.equals(str2)) {
            return;
        }
        C626936e.A0D(false, AnonymousClass000.A0V("Wrong attachment type ", str, AnonymousClass001.A0o()));
    }

    public boolean A0F() {
        C89214c6 r0 = this.A02;
        if (r0 == null || !r0.isShowing()) {
            return false;
        }
        this.A02.dismiss();
        this.A02 = null;
        return true;
    }

    public final boolean A0G(int i) {
        int i2;
        if (this.A0Q.A0E()) {
            return true;
        }
        C009707r r3 = this.A03;
        if (!C107385bE.A08()) {
            i2 = R.string.f11nameremoved;
        } else {
            boolean A0A2 = C107385bE.A0A();
            i2 = R.string.f11nameremoved;
            if (!A0A2) {
                i2 = R.string.f11nameremoved;
            }
        }
        RequestPermissionActivity.A0c(r3, R.string.f11nameremoved, i2, i);
        return false;
    }

    public boolean BM3(Intent intent, int i, int i2) {
        int i3;
        File file;
        Uri data;
        Uri uri;
        Uri fromFile;
        int i4 = i;
        if (i4 == 801) {
            A05();
        } else {
            int i5 = i2;
            if (i4 == 23 && i2 == 0) {
                C60152y5 r1 = this.A0d;
                synchronized (C107655bf.class) {
                    if (C107655bf.A00 > 0) {
                        SharedPreferences.Editor A002 = C60152y5.A00(r1, C58152un.A0A);
                        int i6 = C107655bf.A00 - 1;
                        C107655bf.A00 = i6;
                        A002.putInt("file_index", i6);
                        A002.apply();
                    }
                }
                return true;
            } else if (C107385bE.A0B() && i2 == 0 && i4 == 809 && this.A0Q.A04() == C997357z.PARTIAL) {
                A08();
                return true;
            } else {
                if (i5 == -1) {
                    if (i4 == 30 || i4 == 804) {
                        i3 = 2;
                    } else {
                        i3 = 3;
                        if (i4 != 803) {
                            i3 = 5;
                            if (i4 != 805) {
                                if (i4 == 31) {
                                    A00();
                                    return true;
                                } else if (i4 == 32) {
                                    A01();
                                    return true;
                                } else if (i4 == 150) {
                                    A03();
                                    return true;
                                } else if (i4 == 809) {
                                    A06();
                                    return true;
                                } else if (i4 == 810) {
                                    A07();
                                    return true;
                                } else if (i4 == 807) {
                                    A02();
                                    return true;
                                } else if (i4 == 808) {
                                    A04();
                                    return true;
                                } else if (i4 != 44) {
                                    Intent intent2 = intent;
                                    if (i4 == 6 || i4 == 36) {
                                        if (intent != null) {
                                            C626936e.A06(intent2);
                                            Uri uri2 = (Uri) intent2.getParcelableExtra("uri");
                                            if (intent2.hasExtra("file_path")) {
                                                file = AnonymousClass002.A0B(intent2.getStringExtra("file_path"));
                                            } else {
                                                file = null;
                                            }
                                            Uri data2 = intent2.getData();
                                            List A0r = C86604Kt.A0r(intent2);
                                            if (uri2 != null) {
                                                String stringExtra = intent2.getStringExtra("caption");
                                                List A032 = C624435a.A03(intent2.getStringExtra("mentions"));
                                                for (Object next : A0r) {
                                                    this.A0A.A04(uri2, this.A05, this.A0K.getQuotedMessage(), file, stringExtra, Collections.singletonList(next), A032, 1, this.A0k);
                                                }
                                            } else if (data2 != null) {
                                                AnonymousClass5Ul r15 = this.A0A;
                                                C95814uZ r5 = this.A0W;
                                                C624134x quotedMessage = this.A0K.getQuotedMessage();
                                                r15.A04(data2, this.A05, quotedMessage, (File) null, (String) null, Collections.singletonList(r5), (List) null, 1, this.A0k);
                                            } else {
                                                ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("android.intent.extra.STREAM");
                                                if (parcelableArrayListExtra != null) {
                                                    int size = parcelableArrayListExtra.size();
                                                    Iterator it = parcelableArrayListExtra.iterator();
                                                    while (it.hasNext()) {
                                                        Uri A0c2 = C86664Kz.A0c(it);
                                                        AnonymousClass5Ul r152 = this.A0A;
                                                        C95814uZ r52 = this.A0W;
                                                        C624134x quotedMessage2 = this.A0K.getQuotedMessage();
                                                        r152.A04(A0c2, this.A05, quotedMessage2, (File) null, (String) null, Collections.singletonList(r52), (List) null, size, this.A0k);
                                                    }
                                                }
                                            }
                                            if (intent2.getBooleanExtra("clear_message_after_send", false)) {
                                                this.A0Z.setText("");
                                            }
                                            this.A0K.AxU(5);
                                        }
                                    } else if (i4 == 5) {
                                        C626936e.A06(intent2);
                                        ArrayList parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("result_uris");
                                        if (parcelableArrayListExtra2 == null) {
                                            if (intent2.getData() != null) {
                                                parcelableArrayListExtra2 = AnonymousClass001.A0s();
                                                parcelableArrayListExtra2.add(intent2.getData());
                                            } else {
                                                Log.w("(conversation|messagereply)/audio/share/failed");
                                                this.A07.A0H(R.string.f11nameremoved, 0);
                                            }
                                        }
                                        int size2 = parcelableArrayListExtra2.size();
                                        Iterator it2 = parcelableArrayListExtra2.iterator();
                                        while (it2.hasNext()) {
                                            this.A0j.A0H(C86664Kz.A0c(it2), this.A05, new C116285q2(intent2, this, size2));
                                            this.A0K.AxT();
                                        }
                                    } else if (i4 == 23) {
                                        Uri fromFile2 = Uri.fromFile(C106275Yh.A01(this.A0d));
                                        C107655bf.A0Y(this.A03, fromFile2);
                                        ArrayList A0s = AnonymousClass001.A0s();
                                        if (fromFile2 != null) {
                                            A0s.add(fromFile2);
                                        }
                                        A0D((Byte) null, A0s, 8);
                                        return true;
                                    } else if (i4 == 4) {
                                        if (intent == null || intent2.getData() == null) {
                                            File A012 = C106275Yh.A01(this.A0d);
                                            if (A012.exists()) {
                                                fromFile = Uri.fromFile(A012);
                                                C107655bf.A0Y(this.A03, fromFile);
                                            } else {
                                                C18260x0.A1Q(AnonymousClass001.A0o(), "conversation/video/share/nocapturefile ", A012);
                                                Log.w("conversation/video/share/failed");
                                                this.A07.A0H(R.string.f11nameremoved, 0);
                                                return true;
                                            }
                                        } else {
                                            fromFile = intent2.getData();
                                        }
                                        if (fromFile != null) {
                                            A0D((Byte) null, C18300x5.A0s(fromFile), 8);
                                            return true;
                                        }
                                        Log.w("conversation/video/share/failed");
                                        this.A07.A0H(R.string.f11nameremoved, 0);
                                        return true;
                                    } else if (i4 == 21) {
                                        if (intent != null) {
                                            ArrayList A0s2 = AnonymousClass001.A0s();
                                            ClipData clipData = intent2.getClipData();
                                            if (clipData != null) {
                                                for (int i7 = 0; i7 < clipData.getItemCount(); i7++) {
                                                    ClipData.Item itemAt = clipData.getItemAt(i7);
                                                    if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                                                        A0s2.add(uri);
                                                    }
                                                }
                                            }
                                            if (A0s2.isEmpty() && (data = intent2.getData()) != null) {
                                                A0s2.add(data);
                                            }
                                            A0D((Byte) null, A0s2, 1);
                                            return true;
                                        }
                                    }
                                    if (C86614Ku.A1Y(this.A0T)) {
                                        A0F();
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    A09(i3);
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass4Rp r0 = this.A01;
        if (r0 != null && r0.isShowing()) {
            this.A01.A03();
        }
        this.A0f.A07(this.A0e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (X.C154437dA.A00(r3.A00) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r8 = this;
            boolean r0 = X.C107385bE.A08()
            if (r0 != 0) goto L_0x000e
            r0 = 808(0x328, float:1.132E-42)
            boolean r0 = r8.A0G(r0)
            if (r0 == 0) goto L_0x0063
        L_0x000e:
            X.2s6 r1 = r8.A0O
            X.4Ep r0 = r8.A0N
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0063
            X.07r r5 = r8.A03
            X.4uZ r7 = r8.A0W
            com.whatsapp.mentions.MentionableEntry r0 = r8.A0Z
            java.lang.String r6 = r0.getStringText()
            java.util.List r4 = r0.getMentions()
            X.5XO r3 = r8.A0i
            if (r3 == 0) goto L_0x0033
            X.1VX r0 = r3.A00
            boolean r1 = X.C154437dA.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "com.whatsapp.documentpicker.DocumentPickerBottomSheetActivity"
        L_0x0040:
            X.C86604Kt.A13(r2, r7, r1, r0)
            java.lang.String r0 = "caption"
            r2.putExtra(r0, r6)
            boolean r1 = X.C18320x8.A1U(r6)
            java.lang.String r0 = "clear_message_after_send"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "mentions"
            java.lang.String r0 = X.C624435a.A01(r4)
            r2.putExtra(r1, r0)
            r0 = 6
            r5.startActivityForResult(r2, r0)
            if (r3 == 0) goto L_0x0063
            r3.A01(r5)
        L_0x0063:
            return
        L_0x0064:
            java.lang.String r0 = "com.whatsapp.documentpicker.DocumentPickerActivity"
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89894fS.A04():void");
    }

    public final void A0D(Byte b, ArrayList arrayList, int i) {
        if (!arrayList.isEmpty()) {
            C009707r r3 = this.A03;
            AnonymousClass5PE r4 = new AnonymousClass5PE(r3);
            r4.A0G = arrayList;
            r4.A0C = C627336j.A07(this.A0W);
            r4.A02 = i;
            r4.A0K = true;
            AnonymousClass5YF r6 = new AnonymousClass5YF((Uri) arrayList.get(0));
            MentionableEntry mentionableEntry = this.A0Z;
            r6.A0G(mentionableEntry.getStringText());
            this.A0Y.A01(r6.A0C(), mentionableEntry.getMentions());
            r6.A0I(r6.A0C());
            r6.A0F(b);
            AnonymousClass5PE.A00(new C106105Xq(r6), r4);
            C624134x quotedMessage = this.A0K.getQuotedMessage();
            if (quotedMessage != null) {
                r4.A06 = quotedMessage.A1L;
                r4.A0D = C627336j.A07(C627636p.A05(quotedMessage));
            }
            r3.startActivityForResult(r4.A01(), 22);
            return;
        }
        Log.e("conversation/setuppreview/share-failed");
        this.A07.A0H(R.string.f11nameremoved, 0);
    }

    public C89894fS(C009707r r11, C55682qk r12, AnonymousClass4FU r13, C64393Dh r14, C69263Wi r15, C181568my r16, C56972sr r17, AnonymousClass5Ul r18, C621033m r19, C105035Th r20, C620433g r21, AnonymousClass5XF r22, C50482iF r23, AnonymousClass2PX r24, C56962sq r25, ConversationCommunityViewModel conversationCommunityViewModel, C44772Xk r27, C185428td r28, C100275Ag r29, C113895mA r30, C85014Ep r31, C56512s6 r32, C620633i r33, AnonymousClass5ZR r34, AnonymousClass33p r35, C61072zf r36, AnonymousClass1VX r37, AnonymousClass4FV r38, AnonymousClass5MZ r39, C95814uZ r40, C28071fd r41, C48682fI r42, MentionableEntry mentionableEntry, AnonymousClass9Tp r44, C1901794j r45, C194079Rm r46, C49632gq r47, C60152y5 r48, C29321id r49, C105895Wv r50, AnonymousClass5XO r51, C989053r r52, boolean z) {
        AnonymousClass6BS r0 = new AnonymousClass6BS(this, 1);
        this.A0e = r0;
        this.A03 = r11;
        this.A05 = r13;
        this.A0T = r37;
        this.A07 = r15;
        this.A0h = r50;
        this.A09 = r17;
        this.A0A = r18;
        this.A04 = r12;
        this.A06 = r14;
        this.A0U = r38;
        this.A0F = r23;
        this.A0B = r19;
        this.A0E = r22;
        this.A0Y = r42;
        this.A0S = r36;
        this.A0X = r41;
        this.A0G = r24;
        this.A0j = r52;
        this.A0P = r33;
        this.A0H = r25;
        this.A0c = r47;
        this.A0O = r32;
        this.A0J = r27;
        this.A0Q = r34;
        this.A0R = r35;
        this.A0C = r20;
        this.A0D = r21;
        C29321id r3 = r49;
        this.A0f = r3;
        this.A0d = r48;
        this.A0M = r30;
        this.A0i = r51;
        this.A0K = r28;
        this.A0N = r31;
        this.A0W = r40;
        this.A0k = z;
        this.A0Z = mentionableEntry;
        this.A0L = r29;
        r3.A06(r0);
        this.A0a = r44;
        this.A0V = r39;
        this.A0I = conversationCommunityViewModel;
        this.A08 = r16;
        C194079Rm r310 = r46;
        this.A0b = r310.A00(r11, r13, r45, C117085rM.A00(this, 0), (Runnable) null, true);
    }
}
