package X;

/* renamed from: X.1oY  reason: invalid class name and case insensitive filesystem */
public class C31601oY extends C31891p1 {
    public String A00;

    public C31601oY(AnonymousClass2z0 r7, long j) {
        super(r7, (AnonymousClass39T) null, 83, j);
    }

    public static String A01(String str) {
        String str2 = "invite_link";
        if (!str2.equals(str)) {
            str2 = "linked_group_join";
            if (!str2.equals(str)) {
                str2 = "non_admin_add";
                if (!str2.equals(str)) {
                    return null;
                }
            }
        }
        return str2;
    }
}
