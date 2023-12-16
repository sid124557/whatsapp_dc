package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.302  reason: invalid class name */
public class AnonymousClass302 {
    public final C55682qk A00;
    public final C72303dV A01;

    public static final ContentValues A00(C58932w3 r3, long j) {
        Integer num;
        AnonymousClass23A r0;
        ContentValues A07 = AnonymousClass0x9.A07(6);
        C18270x1.A0a(A07, j);
        A07.put("text_data", r3.A08);
        A07.put("extra_data", r3.A01);
        A07.put("button_type", Integer.valueOf(r3.A06));
        A07.put("used", Integer.valueOf(r3.A04 ? 1 : 0));
        A07.put("selected_index", Integer.valueOf(r3.A05));
        A07.put("selected_carousel_card_index", r3.A07);
        A07.put("otp_button_type", Integer.valueOf(r3.A0A.get()));
        A07.put("extra_consent_data", r3.A09);
        A07.put("otp_matched_package_name", r3.A02);
        String str = r3.A03;
        if (!(str == null || str.length() == 0)) {
            String A0g = C18320x8.A0g(Locale.ROOT, str);
            int hashCode = A0g.hashCode();
            if (hashCode != 3154575) {
                if (hashCode != 3552429) {
                    if (hashCode == 950483747 && A0g.equals("compact")) {
                        r0 = AnonymousClass23A.COMPACT;
                    }
                } else if (A0g.equals("tall")) {
                    r0 = AnonymousClass23A.TALL;
                }
            } else if (A0g.equals("full")) {
                r0 = AnonymousClass23A.FULL;
            }
            num = Integer.valueOf(r0.value);
            A07.put("webview_presentation", num);
            return A07;
        }
        num = null;
        A07.put("webview_presentation", num);
        return A07;
    }

    public void A02(C624134x r39) {
        Cursor A0E;
        C47142cm r7;
        AnonymousClass4FG r1;
        Long valueOf;
        Integer num;
        int i;
        AnonymousClass23A A002;
        String str;
        C624134x r12 = r39;
        C626936e.A0E(r12 instanceof AnonymousClass4FG, "TemplateMessageStore/fillTemplateData/message needs to be FMessageTemplate.");
        long j = r12.A1L;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A03 = this.A01.get();
        try {
            C56862sg r4 = ((AnonymousClass3H0) A03).A03;
            String valueOf2 = String.valueOf(j);
            A0E = r4.A0E("SELECT content_text_data, footer_text_data, template_id, csat_trigger_expiration_ts, category, tag, mask_linked_devices FROM message_template WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_SQL", new String[]{valueOf2});
            if (!A0E.moveToFirst()) {
                Log.e("TemplateMessageStore/getTemplateData/no template data in the table.");
                A0E.close();
                A03.close();
                C55682qk r3 = this.A00;
                StringBuilder A0o = AnonymousClass001.A0o();
                C624134x.A0S(r12, "message.key", A0o);
                r3.A0A("TemplateMessageStore/fillTemplateData/template data is missing.", true, A0o.toString());
                r1 = (AnonymousClass4FG) r12;
                r7 = new C47142cm((Long) null, "", (String) null, (String) null, (String) null, (String) null, (List) null, false);
            } else {
                String A0Z = AnonymousClass0x2.A0Z(A0E, "content_text_data");
                String A0Z2 = AnonymousClass0x2.A0Z(A0E, "footer_text_data");
                String A0Z3 = AnonymousClass0x2.A0Z(A0E, "template_id");
                long A0C = AnonymousClass0x2.A0C(A0E, "csat_trigger_expiration_ts");
                String A0Z4 = AnonymousClass0x2.A0Z(A0E, "category");
                String A0Z5 = AnonymousClass0x2.A0Z(A0E, "tag");
                boolean A032 = C626135u.A03(A0E, A0E.getColumnIndexOrThrow("mask_linked_devices"));
                A0E.close();
                A0E = r4.A0E("SELECT _id, text_data, extra_data, button_type, used, selected_index, selected_carousel_card_index, otp_button_type, extra_consent_data, otp_matched_package_name, webview_presentation FROM message_template_button WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_BUTTONS_SQL", new String[]{valueOf2});
                int A02 = AnonymousClass0x7.A02(A0E);
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("text_data");
                int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("extra_data");
                int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("button_type");
                int columnIndexOrThrow4 = A0E.getColumnIndexOrThrow("used");
                int columnIndexOrThrow5 = A0E.getColumnIndexOrThrow("selected_index");
                int columnIndexOrThrow6 = A0E.getColumnIndexOrThrow("selected_carousel_card_index");
                int columnIndexOrThrow7 = A0E.getColumnIndexOrThrow("otp_button_type");
                int columnIndexOrThrow8 = A0E.getColumnIndexOrThrow("extra_consent_data");
                int columnIndexOrThrow9 = A0E.getColumnIndexOrThrow("otp_matched_package_name");
                int columnIndexOrThrow10 = A0E.getColumnIndexOrThrow("webview_presentation");
                while (A0E.moveToNext()) {
                    long j2 = A0E.getLong(A02);
                    String string = A0E.getString(columnIndexOrThrow);
                    String string2 = A0E.getString(columnIndexOrThrow2);
                    int i2 = A0E.getInt(columnIndexOrThrow3);
                    boolean A1U = AnonymousClass000.A1U(A0E.getInt(columnIndexOrThrow4), 1);
                    int i3 = A0E.getInt(columnIndexOrThrow5);
                    if (!A0E.isNull(columnIndexOrThrow6)) {
                        num = C18300x5.A0a(A0E, columnIndexOrThrow6);
                    } else {
                        num = null;
                    }
                    int i4 = A0E.getInt(columnIndexOrThrow7);
                    String string3 = A0E.getString(columnIndexOrThrow8);
                    String string4 = A0E.getString(columnIndexOrThrow9);
                    if (!A0E.isNull(columnIndexOrThrow10)) {
                        i = A0E.getInt(columnIndexOrThrow10);
                    } else {
                        i = 0;
                    }
                    C58932w3 r21 = new C58932w3(num, string, string2, string3, string4, i2, i3, i4, A1U);
                    r21.A00 = j2;
                    if (i > 0 && (A002 = AnonymousClass23A.A00(i)) != null) {
                        int ordinal = A002.ordinal();
                        if (ordinal == 0) {
                            str = "full";
                        } else if (ordinal == 1) {
                            str = "tall";
                        } else if (ordinal == 2) {
                            str = "compact";
                        } else {
                            throw C73153f1.A00();
                        }
                        r21.A03 = str;
                    }
                    A0s.add(r21);
                }
                A0E.close();
                A03.close();
                C626936e.A06(A0Z);
                if (A0s.size() == 0) {
                    A0s = null;
                }
                if (A0C == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(A0C);
                }
                r7 = new C47142cm(valueOf, A0Z, A0Z2, A0Z3, A0Z4, A0Z5, A0s, A032);
                r1 = (AnonymousClass4FG) r12;
            }
            r1.BnY(r7);
            return;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A03(C624134x r19) {
        C85284Fq A04;
        C624134x r5 = r19;
        if (!(r5 instanceof AnonymousClass4FG)) {
            throw AnonymousClass001.A0c("message must be template message");
        } else if (r5.A1L != -1) {
            C72303dV r4 = this.A01;
            C85284Fq A042 = r4.A04();
            try {
                C69833Yo Axl = A042.Axl();
                try {
                    AnonymousClass4FG r8 = (AnonymousClass4FG) r5;
                    C47142cm BDY = r8.BDY();
                    ContentValues A07 = AnonymousClass0x9.A07(5);
                    C624134x.A0H(A07, r5);
                    A07.put("content_text_data", BDY.A02);
                    A07.put("footer_text_data", BDY.A03);
                    A07.put("template_id", BDY.A05);
                    A07.put("csat_trigger_expiration_ts", BDY.A00);
                    A07.put("category", BDY.A01);
                    A07.put("tag", BDY.A04);
                    AnonymousClass0x2.A0o(A07, "mask_linked_devices", BDY.A07);
                    C626936e.A0F(AnonymousClass000.A1T((((AnonymousClass3H0) A042).A03.A0C("message_template", "INSERT_TEMPLATE_SQL", A07, 5) > r5.A1L ? 1 : (((AnonymousClass3H0) A042).A03.A0C("message_template", "INSERT_TEMPLATE_SQL", A07, 5) == r5.A1L ? 0 : -1))), "TemplateMessageStore/insertOrUpdateTemplateData/inserted row should have same row_id");
                    List<C58932w3> list = r8.BDY().A06;
                    if (list != null) {
                        for (C58932w3 r3 : list) {
                            long j = r5.A1L;
                            A04 = r4.A04();
                            ContentValues A002 = A00(r3, j);
                            long j2 = r3.A00;
                            if (j2 == -1) {
                                r3.A00 = ((AnonymousClass3H0) A04).A03.A08("message_template_button", "INSERT_TEMPLATE_BUTTON_SQL", A002);
                            } else {
                                C56862sg r12 = ((AnonymousClass3H0) A04).A03;
                                String[] strArr = new String[1];
                                C18260x0.A1X(strArr, j2);
                                if (r12.A05(A002, "message_template_button", "_id = ?", "UPDATE_TEMPLATE_BUTTON_SQL", strArr) != 1) {
                                    Log.e("TemplateMessageStore/insertOrUpdateTemplateButton/fail to update template button.");
                                }
                            }
                            A04.close();
                        }
                    }
                    Axl.A00();
                    Axl.close();
                    A042.close();
                    return;
                } catch (Throwable th) {
                    Axl.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    A042.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } else {
            throw AnonymousClass001.A0c("main message part must be inserted before");
        }
        throw th;
    }

    public void A04(C624134x r13, Integer num, String str, int i) {
        if (r13.A1L == -1) {
            throw AnonymousClass001.A0c("main message part must be inserted before");
        } else if (r13.A1I == 32) {
            C58932w3 r2 = new C58932w3(num, "", str, "", (String) null, 1, i, 0, false);
            C85284Fq A04 = this.A01.A04();
            try {
                ((AnonymousClass3H0) A04).A03.A08("message_template_button", "INSERT_TEMPLATE_BUTTON_SQL", A00(r2, r13.A1L));
                A04.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            throw AnonymousClass001.A0c("only for template button reply message");
        }
    }

    public void A05(AnonymousClass4FG r13, long j) {
        Cursor A0E;
        C626936e.A0E(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1))), "TemplateMessageStore/fillQuotedTemplateData/parent message row must be set");
        AnonymousClass4GK A03 = this.A01.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A03).A03;
            String[] strArr = new String[1];
            AnonymousClass0x2.A1S(strArr, 0, j);
            A0E = r3.A0E("SELECT content_text_data, footer_text_data FROM message_template_quoted WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_QUOTED_SQL", strArr);
            if (A0E.moveToFirst()) {
                String A0Z = AnonymousClass0x2.A0Z(A0E, "content_text_data");
                String A0Z2 = AnonymousClass0x2.A0Z(A0E, "footer_text_data");
                A0E.close();
                A03.close();
                C626936e.A06(A0Z);
                r13.BnY(new C47142cm((Long) null, A0Z, A0Z2, (String) null, (String) null, (String) null, (List) null, false));
                return;
            }
            throw AnonymousClass001.A0c(AnonymousClass000.A0Z("TemplateMessageStore/fillQuotedTemplateData/missing template info for quoted message; rowId=", AnonymousClass001.A0o(), j));
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass302(C55682qk r1, C72303dV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C58932w3 A01(long j) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A01.get();
        try {
            C56862sg r7 = ((AnonymousClass3H0) A03).A03;
            String[] strArr = new String[1];
            long j2 = j;
            boolean A1W = AnonymousClass0x7.A1W(strArr, j2);
            A0E = r7.A0E("SELECT _id, text_data, extra_data, button_type, used, selected_index, selected_carousel_card_index, otp_button_type, extra_consent_data, otp_matched_package_name, webview_presentation FROM message_template_button WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_BUTTONS_SQL", strArr);
            Integer num = null;
            if (!A0E.moveToFirst()) {
                C18260x0.A11("TemplateMessageStore/getTemplateButtonReplyData/Template button reply data doesn't exist in the table; messageRowId=", AnonymousClass001.A0o(), j2);
                A0E.close();
                A03.close();
                return null;
            }
            long A012 = C18270x1.A01(A0E);
            String A0Z = AnonymousClass0x2.A0Z(A0E, "text_data");
            String A0Z2 = AnonymousClass0x2.A0Z(A0E, "extra_data");
            String A0Z3 = AnonymousClass0x2.A0Z(A0E, "extra_consent_data");
            int A04 = AnonymousClass0x2.A04(A0E, "button_type");
            boolean A1U = AnonymousClass000.A1U(AnonymousClass0x2.A04(A0E, "used"), 1);
            int A042 = AnonymousClass0x2.A04(A0E, "selected_index");
            if (!A0E.isNull(A0E.getColumnIndexOrThrow("selected_carousel_card_index"))) {
                num = Integer.valueOf(AnonymousClass0x2.A04(A0E, "selected_carousel_card_index"));
            }
            C58932w3 r9 = new C58932w3(num, A0Z, A0Z2, A0Z3, (String) null, A04, A042, A1W ? 1 : 0, A1U);
            r9.A00 = A012;
            A0E.close();
            A03.close();
            return r9;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
