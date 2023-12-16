package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.34q  reason: invalid class name and case insensitive filesystem */
public final class C623434q {
    public final C29171iO A00;
    public final C56972sr A01;
    public final C56612sH A02;
    public final C56982ss A03;
    public final AnonymousClass2Y3 A04;
    public final C56152rV A05;
    public final AnonymousClass1VX A06;
    public final C26161bg A07;
    public final AnonymousClass4FV A08;
    public final C54602oz A09;
    public final C55882r4 A0A;

    public final C624134x A04(C95814uZ r10) {
        Cursor A0E;
        C56152rV r5 = this.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            AnonymousClass4GK A032 = r5.A06.get();
            try {
                C56862sg r6 = ((AnonymousClass3H0) A032).A03;
                String str = C58162uo.A08;
                String[] A1Z = AnonymousClass0x9.A1Z();
                C56922sm.A02(r5.A01, r10, A1Z, 0);
                A1Z[1] = String.valueOf(1);
                A0E = r6.A0E(str, "GET_LAST_SIGNIFICANT_OUTGOING_MESSAGES_SQL", A1Z);
                while (A0E.moveToNext()) {
                    C624134x A042 = r5.A09.A04(A0E, r10);
                    if (A042 != null) {
                        A0s.add(A042);
                    }
                }
                A0E.close();
                A032.close();
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r5.A05.A04();
        } catch (IllegalStateException e2) {
            Log.i("msgstore/getLastSignificantOutgoingMessages/IllegalStateException ", e2);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        if (AnonymousClass0x7.A1S(A0s)) {
            return (C624134x) A0s.get(0);
        }
        return null;
        throw th;
    }

    public final String A09(C624134x r8) {
        String str;
        C162457s7.A0J(r8, 0);
        if (r8 instanceof AnonymousClass4FG) {
            C47142cm BDY = ((AnonymousClass4FG) r8).BDY();
            C162457s7.A0D(BDY);
            str = BDY.A05;
        } else {
            str = null;
        }
        if (r8 instanceof C30791n7) {
            str = this.A04.A00(r8);
        }
        if (!C624134x.A0f(r8)) {
            return str;
        }
        String str2 = r8.A1J.A01;
        if (!this.A06.A0Y(C58422vE.A02, 4658)) {
            return str2;
        }
        this.A09.A00(new C51692kE(C73833g9.A06(Arrays.copyOf(new C370920x[]{C370920x.SKIP_ADDONS, C370920x.SKIP_THUMBNAILS}, 2)), false), r8);
        if (r8.A14() != null) {
            return r8.A14();
        }
        return str2;
    }

    public final void A0A(AnonymousClass3ZG r4, C624134x r5) {
        AnonymousClass4FV r1 = this.A08;
        r1.BhD(r4);
        if (!C624134x.A0f(r5) && this.A00.A00) {
            r1.BlF(true);
        }
    }

    public final boolean A0C(C624134x r4) {
        if (r4 instanceof AnonymousClass4FG) {
            return true;
        }
        if (!(r4 instanceof C30791n7) || this.A04.A00(r4) == null) {
            return false;
        }
        return true;
    }

    public static final int A00(AnonymousClass3ZH r2) {
        C55502qS r22 = r2.A0E;
        if (r22 != null) {
            if (r22.A03()) {
                return 2;
            }
            if (r22.A02()) {
                return 3;
            }
        }
        return 1;
    }

    public static final String A01(byte b) {
        if (b == 0) {
            return "undefined";
        }
        if (b == 1) {
            return "image";
        }
        if (b == 2) {
            return "audio";
        }
        if (b == 3) {
            return "video";
        }
        if (b == 4) {
            return "vcard";
        }
        if (b == 5) {
            return "location";
        }
        if (b == 8) {
            return "call";
        }
        if (b == 9) {
            return "document";
        }
        if (b == 10) {
            return "missed_call";
        }
        if (b == 13) {
            return "gif";
        }
        if (b == 16) {
            return "livelocation";
        }
        if (b == 19) {
            return "hsm_rejected";
        }
        if (b == 20) {
            return "sticker";
        }
        if (b == 23) {
            return "product";
        }
        if (b == 24) {
            return "group_invite";
        }
        if (b == 25) {
            return "template_image";
        }
        if (b == 26) {
            return "template_document";
        }
        if (b == 27) {
            return "template_hsm";
        }
        if (b == 28) {
            return "template_video";
        }
        if (b == 29) {
            return "template_gif";
        }
        if (b == 30) {
            return "template_location";
        }
        if (b == 32) {
            return "template_quick_reply";
        }
        if (b == 33) {
            return "blank_reply";
        }
        if (b == 37) {
            return "catalog";
        }
        if (b == 42) {
            return "view_once_image";
        }
        if (b == 43) {
            return "view_once_video";
        }
        if (b == 44) {
            return "order";
        }
        if (b == 49) {
            return "buttons_response";
        }
        if (b == 51) {
            return "payment_invite";
        }
        if (b == 52) {
            return "product_list";
        }
        if (b == 54) {
            return "checkout";
        }
        if (b == 55) {
            return "interactive_message";
        }
        if (b == 56) {
            return "reaction";
        }
        if (b == 57) {
            return "interactive_image_message";
        }
        if (b == 58) {
            return "invisible_hello";
        }
        if (b == 59) {
            return "waffle_image";
        }
        if (b == 60) {
            return "waffle_video";
        }
        if (b == 61) {
            return "waffle_gif";
        }
        if (b == 62) {
            return "interactive_video_message";
        }
        if (b == 63) {
            return "interactive_document_message";
        }
        if (b == 85) {
            return "interactive_location_message";
        }
        if (b == 65) {
            return "payment_background_image";
        }
        if (b == 66) {
            return "poll";
        }
        if (b == 67) {
            return "poll_vote";
        }
        if (b == 72) {
            return "request_phone";
        }
        if (b == 73) {
            return "share_phone_number";
        }
        if (b == 74) {
            return "edited_message";
        }
        return null;
    }

    public static final String A02(C624134x r1) {
        if (r1 instanceof AnonymousClass4FG) {
            return ((AnonymousClass4FG) r1).BDY().A04;
        }
        return null;
    }

    public final long A03(C624134x r6) {
        return TimeUnit.MILLISECONDS.toSeconds(Math.max(this.A02.A0H() - r6.A0I, 0));
    }

    public final Integer A05(C624134x r3) {
        String str;
        int A002;
        if (r3 instanceof AnonymousClass4FG) {
            C47142cm BDY = ((AnonymousClass4FG) r3).BDY();
            C162457s7.A0D(BDY);
            str = BDY.A01;
        } else {
            str = null;
        }
        if (C624134x.A0f(r3)) {
            str = "MARKETING_MESSAGE_SMB";
        } else if (str == null) {
            return null;
        }
        if ("TRANSACTIONAL".equals(str)) {
            A002 = 1;
        } else if ("NON_TRANSACTIONAL".equals(str)) {
            A002 = 2;
        } else if ("OTP".equals(str)) {
            A002 = 3;
        } else {
            A002 = AnonymousClass0x9.A00("MARKETING_MESSAGE_SMB".equals(str) ? 1 : 0);
        }
        return Integer.valueOf(A002);
    }

    public final Long A07(C624134x r6) {
        if (r6 == null) {
            return null;
        }
        return C18320x8.A0Y(TimeUnit.MILLISECONDS, Math.max(C56612sH.A04(this.A02, r6), 0));
    }

    public final String A08(AnonymousClass3ZH r4) {
        C95814uZ r0 = r4.A0H;
        if (r0 == null) {
            return null;
        }
        C26161bg r2 = this.A07;
        return AnonymousClass30N.A01(r2.A06(AnonymousClass0x9.A1C()), r0.getRawString());
    }

    public final boolean A0B() {
        C56972sr r1 = this.A01;
        return !r1.A0b(C56972sr.A03(r1));
    }

    public C623434q(C29171iO r2, C56972sr r3, C56612sH r4, C56982ss r5, AnonymousClass2Y3 r6, C56152rV r7, AnonymousClass1VX r8, C26161bg r9, AnonymousClass4FV r10, C54602oz r11, C55882r4 r12) {
        C18260x0.A0f(r4, r8, r7, r10, r5);
        C162457s7.A0J(r11, 7);
        C18260x0.A0X(r6, r2, r3);
        C162457s7.A0J(r12, 11);
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = r7;
        this.A08 = r10;
        this.A03 = r5;
        this.A07 = r9;
        this.A09 = r11;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A0A = r12;
    }

    public final Long A06(C95814uZ r5) {
        C624134x A042 = A04(r5);
        if (!this.A06.A0Y(C58422vE.A02, 6545) || A042 == null) {
            return null;
        }
        return Long.valueOf(A042.A0K);
    }

    public final boolean A0D(C624134x r3) {
        if (A0C(r3) || C624134x.A0f(r3)) {
            return true;
        }
        return false;
    }
}
