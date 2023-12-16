package X;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/* renamed from: X.7bN  reason: invalid class name and case insensitive filesystem */
public abstract class C153467bN {
    public final AnonymousClass7TE A00;

    public static C131296dM A00(Class cls, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("can not map a ");
        sb.append(obj);
        sb.append(" to ");
        sb.append(cls.getName());
        return new C131296dM(sb.toString());
    }

    public Object A01() {
        if (!(this instanceof C175968aA)) {
            if (this instanceof C175978aB) {
                try {
                    return AnonymousClass6C8.A0d(((C175978aB) this).A00);
                } catch (Exception unused) {
                    return null;
                }
            } else if (!(this instanceof C175958a9)) {
                if (this instanceof C175938a7) {
                    throw AnonymousClass001.A0g("newInstance");
                } else if (this instanceof C175988aC) {
                    return AnonymousClass001.A0s();
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Invalid or non Implemented status");
                    AnonymousClass6C7.A1O(A0o, " createArray() in ", this);
                    throw AnonymousClass6C7.A0e(A0o);
                }
            }
        }
        return new AnonymousClass8TO();
    }

    public Object A02() {
        if (this instanceof C175968aA) {
            return C18320x8.A0r();
        }
        if (this instanceof C175978aB) {
            try {
                return AnonymousClass6C8.A0d(((C175978aB) this).A00);
            } catch (Exception unused) {
                return null;
            }
        } else if (this instanceof C175958a9) {
            return new AnonymousClass8TX();
        } else {
            if (this instanceof C175948a8) {
                throw AnonymousClass001.A0g("newInstance");
            } else if (this instanceof C175928a6) {
                throw AnonymousClass001.A0g("newInstance");
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Invalid or non Implemented status");
                AnonymousClass6C7.A1O(A0o, " createObject() in ", this);
                throw AnonymousClass6C7.A0e(A0o);
            }
        }
    }

    public Object A03(Object obj) {
        if (this instanceof C175818Zv) {
            List<Object> list = (List) obj;
            Object[] objArr = (Object[]) Array.newInstance(((C175818Zv) this).A01, list.size());
            int i = 0;
            for (Object obj2 : list) {
                objArr[i] = obj2;
                i++;
            }
            return objArr;
        } else if (this instanceof C175918a5) {
            return C18270x1.A0T(obj);
        } else {
            if (this instanceof C175908a4) {
                if (obj == null) {
                    return null;
                }
                Class<?> cls = obj.getClass();
                Class<Long> cls2 = Long.class;
                if (cls2.isAssignableFrom(cls)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls) || Double.class.isAssignableFrom(cls) || BigDecimal.class.isAssignableFrom(cls) || Float.class.isAssignableFrom(cls)) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (String.class.isAssignableFrom(cls)) {
                    return Long.valueOf(obj.toString());
                }
                throw A00(cls2, cls);
            } else if (this instanceof C175898a3) {
                if (obj == null) {
                    return null;
                }
                Class<?> cls3 = obj.getClass();
                Class<Integer> cls4 = Integer.class;
                if (cls4.isAssignableFrom(cls3)) {
                    return obj;
                }
                if (Long.class.isAssignableFrom(cls3) || Double.class.isAssignableFrom(cls3) || BigDecimal.class.isAssignableFrom(cls3) || Float.class.isAssignableFrom(cls3)) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                if (String.class.isAssignableFrom(cls3)) {
                    return Integer.valueOf(obj.toString());
                }
                throw A00(cls4, cls3);
            } else if (this instanceof C175888a2) {
                if (obj == null) {
                    return null;
                }
                Class<?> cls5 = obj.getClass();
                Class<Float> cls6 = Float.class;
                if (cls6.isAssignableFrom(cls5)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls5) || Long.class.isAssignableFrom(cls5) || BigDecimal.class.isAssignableFrom(cls5) || Double.class.isAssignableFrom(cls5)) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                if (String.class.isAssignableFrom(cls5)) {
                    return Float.valueOf(obj.toString());
                }
                throw A00(cls6, cls5);
            } else if (this instanceof C175878a1) {
                if (obj == null) {
                    return null;
                }
                Class<?> cls7 = obj.getClass();
                Class<Double> cls8 = Double.class;
                if (cls8.isAssignableFrom(cls7)) {
                    return obj;
                }
                if (Integer.class.isAssignableFrom(cls7) || Long.class.isAssignableFrom(cls7) || BigDecimal.class.isAssignableFrom(cls7) || Float.class.isAssignableFrom(cls7)) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
                if (String.class.isAssignableFrom(cls7)) {
                    return Double.valueOf(obj.toString());
                }
                throw A00(cls8, cls7);
            } else if (this instanceof C175868a0) {
                if (obj == null) {
                    return null;
                }
                Class<Date> cls9 = Date.class;
                Class<?> cls10 = obj.getClass();
                if (cls9.isAssignableFrom(cls10)) {
                    return obj;
                }
                if (Long.class.isAssignableFrom(cls10)) {
                    return new Date(C18310x6.A0B(obj));
                }
                if (String.class.isAssignableFrom(cls10)) {
                    try {
                        return DateFormat.getInstance().parse(obj.toString());
                    } catch (ParseException e) {
                        throw new C131296dM((Throwable) e);
                    }
                } else {
                    throw A00(cls9, cls10);
                }
            } else if (this instanceof C175858Zz) {
                if (obj == null) {
                    return null;
                }
                Class<?> cls11 = obj.getClass();
                Class<Boolean> cls12 = Boolean.class;
                if (cls12.isAssignableFrom(cls11)) {
                    return obj;
                }
                throw A00(cls12, cls11);
            } else if (this instanceof C175848Zy) {
                if (obj != null) {
                    return new BigInteger(obj.toString());
                }
                return null;
            } else if (!(this instanceof C175838Zx)) {
                return obj;
            } else {
                if (obj != null) {
                    return new BigDecimal(obj.toString());
                }
                return null;
            }
        }
    }

    public C153467bN(AnonymousClass7TE r1) {
        this.A00 = r1;
    }
}
