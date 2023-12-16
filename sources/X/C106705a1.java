package X;

import android.provider.ContactsContract;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5a1  reason: invalid class name and case insensitive filesystem */
public class C106705a1 {
    public static HashMap A0D = AnonymousClass001.A0t();
    public static HashMap A0E;
    public String A00;
    public String A01;
    public String A02;
    public List A03;
    public List A04 = AnonymousClass001.A0s();
    public List A05;
    public List A06;
    public List A07;
    public Map A08;
    public C148447Ik A09 = new C148447Ik();
    public C103875Ot A0A = new C103875Ot();
    public byte[] A0B;
    public final AnonymousClass7OE A0C = new AnonymousClass7OE();

    public static AnonymousClass5T6 A00(Object obj, C106705a1 r3) {
        return (AnonymousClass5T6) ((List) r3.A08.get(obj)).get(0);
    }

    public static C149097La A01(String str) {
        if (str != null) {
            AnonymousClass5QS r3 = new AnonymousClass5QS();
            try {
                Iterator it = C106325Yn.A00(str).iterator();
                while (it.hasNext()) {
                    C106325Yn.A01(Arrays.asList(C106325Yn.A00.split(AnonymousClass001.A0m(it))), r3);
                }
                List list = r3.A02;
                if (list.size() > 0 && ((C149097La) list.get(0)).A01.equals("VCARD")) {
                    return (C149097La) list.get(0);
                }
            } catch (Exception e) {
                Log.e("Error parsing vcard", new C376923q(e));
                return null;
            }
        }
        return null;
    }

    public String A03() {
        String str = this.A0A.A01;
        if (str != null) {
            return str;
        }
        List list = this.A05;
        if (list != null && list.size() > 0) {
            return ((C148457Il) C18290x4.A0k(this.A05)).A00;
        }
        List list2 = this.A06;
        if (list2 != null && list2.size() > 0) {
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                AnonymousClass7OD A0R = AnonymousClass4L0.A0R(it);
                if (A0R.A04) {
                    return A0R.A02;
                }
            }
        }
        List list3 = this.A03;
        if (list3 == null || list3.size() <= 0) {
            return "";
        }
        for (AnonymousClass5KP r2 : this.A03) {
            if (r2.A01 == ContactsContract.CommonDataKinds.Email.class && r2.A05) {
                return r2.A02;
            }
        }
        return "";
    }

    public void A04(UserJid userJid, String str, String str2, int i, boolean z) {
        if (str == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("contactstruct/addphone/data is null; skipping (type=");
            A0o.append(i);
            A0o.append(" jidFromWaId=");
            A0o.append(userJid);
            A0o.append(" label=");
            A0o.append(str2);
            A0o.append(" isPrimary=");
            A0o.append(z);
            C18260x0.A1M(A0o, ")");
        } else if (str.length() > 30) {
            this.A0C.A01++;
        } else {
            List list = this.A06;
            if (list == null) {
                list = AnonymousClass001.A0s();
                this.A06 = list;
            }
            if (list.size() >= 10) {
                this.A0C.A00++;
                return;
            }
            AnonymousClass7OD r1 = new AnonymousClass7OD();
            r1.A00 = i;
            r1.A01 = userJid;
            r1.A02 = str;
            r1.A03 = str2;
            r1.A04 = z;
            this.A06.add(r1);
        }
    }

    public void A05(String str, String str2) {
        List list = this.A05;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A05 = list;
        }
        C148457Il r0 = new C148457Il();
        r0.A00 = str;
        r0.A01 = str2;
        list.add(r0);
    }

    public void A06(AnonymousClass5T6 r4) {
        List list;
        String str = r4.A02;
        if (str != null && str.length() != 0) {
            String str2 = r4.A01;
            Map map = this.A08;
            if (map == null) {
                map = AnonymousClass001.A0t();
                this.A08 = map;
            }
            if (!map.containsKey(str2)) {
                list = AnonymousClass001.A0s();
                this.A08.put(str2, list);
            } else {
                list = (List) this.A08.get(str2);
            }
            list.add(r4);
        }
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A0E = A0t;
        A0t.put("X-AIM", C18290x4.A0Z());
        A0E.put("X-MSN", AnonymousClass001.A0f());
        A0E.put("X-YAHOO", C18280x3.A0S());
        HashMap hashMap = A0E;
        Integer A0c = C18290x4.A0c();
        hashMap.put("X-GOOGLE-TALK", A0c);
        A0E.put("X-GOOGLE TAL", A0c);
        A0E.put("X-ICQ", C18290x4.A0d());
        A0E.put("X-JABBER", AnonymousClass0x7.A0g());
        A0E.put("X-SKYPE-USERNAME", C18290x4.A0a());
        A0D.put("X-AIM", "AIM");
        A0D.put("X-MSN", "Windows Live");
        A0D.put("X-YAHOO", "YAHOO");
        A0D.put("X-GOOGLE-TALK", "Google Talk");
        A0D.put("X-GOOGLE TAL", "Google Talk");
        A0D.put("X-ICQ", "ICQ");
        A0D.put("X-JABBER", "Jabber");
        A0D.put("X-SKYPE-USERNAME", "Skype");
        A0D.put("NICKNAME", "Nickname");
        A0D.put("BDAY", "Birthday");
    }

    public static void A02(List list, C103875Ot r4) {
        int size = list.size();
        if (size > 1) {
            r4.A00 = (String) C18290x4.A0k(list);
            r4.A02 = AnonymousClass001.A0n(list, 1);
            if (size > 2) {
                if (AnonymousClass001.A0n(list, 2).length() > 0) {
                    r4.A03 = AnonymousClass001.A0n(list, 2);
                }
                if (size > 3) {
                    if (AnonymousClass001.A0n(list, 3).length() > 0) {
                        r4.A06 = AnonymousClass001.A0n(list, 3);
                    }
                    if (size > 4 && AnonymousClass001.A0n(list, 4).length() > 0) {
                        r4.A07 = AnonymousClass001.A0n(list, 4);
                    }
                }
            }
        }
    }
}
