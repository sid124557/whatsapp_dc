package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.8ZR  reason: invalid class name */
public final class AnonymousClass8ZR extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ List $delimitersList;
    public final /* synthetic */ boolean $ignoreCase = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ZR(List list) {
        super(2);
        this.$delimitersList = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3;
        Integer valueOf;
        boolean regionMatches;
        String str;
        CharSequence charSequence = (CharSequence) obj;
        int A0K = AnonymousClass001.A0K(obj2);
        C162457s7.A0J(charSequence, 0);
        List list = this.$delimitersList;
        boolean z = this.$ignoreCase;
        if (z || list.size() != 1) {
            if (A0K < 0) {
                A0K = 0;
            }
            C175698Zj r1 = new C175698Zj(A0K, charSequence.length());
            boolean z2 = charSequence instanceof String;
            int i = r1.A00;
            int i2 = r1.A01;
            int i3 = r1.A02;
            if (z2) {
                if (i3 > 0) {
                    if (i > i2) {
                        return null;
                    }
                } else if (i2 > i) {
                    return null;
                }
                while (true) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        String str2 = (String) next;
                        String str3 = (String) charSequence;
                        int length = str2.length();
                        C162457s7.A0J(str3, 2);
                        if (!z) {
                            regionMatches = str2.regionMatches(0, str3, i, length);
                            continue;
                        } else {
                            regionMatches = str2.regionMatches(z, 0, str3, i, length);
                            continue;
                        }
                        if (regionMatches) {
                            if (next != null) {
                                obj3 = next;
                                break;
                            }
                        }
                    }
                    if (i == i2) {
                        return null;
                    }
                    i += i3;
                }
            } else {
                if (i3 > 0) {
                    if (i > i2) {
                        return null;
                    }
                } else if (i2 > i) {
                    return null;
                }
                while (true) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        String str4 = (String) next2;
                        if (C175728Zm.A0R(str4, charSequence, 0, i, str4.length(), z)) {
                            if (next2 != null) {
                                obj3 = next2;
                                break;
                            }
                        }
                    }
                    if (i == i2) {
                        return null;
                    }
                    i += i3;
                }
            }
            valueOf = Integer.valueOf(i);
            str = obj3;
        } else {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            } else if (size == 1) {
                String A0n = AnonymousClass001.A0n(list, 0);
                int A0G = C175728Zm.A0G(charSequence, A0n, A0K, false);
                if (A0G < 0) {
                    return null;
                }
                valueOf = Integer.valueOf(A0G);
                str = A0n;
            } else {
                throw AnonymousClass001.A0c("List has more than one element.");
            }
        }
        AnonymousClass3Z6 A02 = AnonymousClass3Z6.A02(valueOf, str);
        return AnonymousClass3Z6.A01(A02.first, ((String) A02.second).length());
    }
}
