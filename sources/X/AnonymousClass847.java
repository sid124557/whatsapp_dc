package X;

import com.facebook.quicklog.EventBuilder;
import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.847  reason: invalid class name */
public class AnonymousClass847 implements EventBuilder {
    public int A00 = 7;
    public short A01 = 51;
    public final int A02;
    public final AnonymousClass4FX A03;
    public final C186548vX A04;
    public final Integer A05;
    public final String A06;
    public final ConcurrentSkipListMap A07 = new ConcurrentSkipListMap();
    public final AtomicBoolean A08 = C18280x3.A0l();

    public static void A01(Object obj, Object obj2, AbstractMap abstractMap, int i) {
        abstractMap.put(obj2, new AnonymousClass7IC(i, obj));
    }

    public boolean isSampled() {
        return true;
    }

    public void report() {
        if (this.A08.getAndSet(true)) {
            this.A03.B2n(this.A02);
            return;
        }
        Integer num = this.A05;
        C186548vX r5 = this.A04;
        int i = this.A02;
        if (num != null) {
            int intValue = num.intValue();
            r5.markerStart(i, intValue);
            String str = this.A06;
            if (str != null) {
                r5.BnT(i, intValue, str);
            }
        } else {
            r5.markerStart(i);
            String str2 = this.A06;
            if (str2 != null) {
                r5.BnU(i, str2);
            }
        }
        while (true) {
            ConcurrentSkipListMap concurrentSkipListMap = this.A07;
            if (!concurrentSkipListMap.isEmpty()) {
                Map.Entry pollLastEntry = concurrentSkipListMap.pollLastEntry();
                if (!(pollLastEntry == null || pollLastEntry.getValue() == null || A00(pollLastEntry) == null)) {
                    try {
                        int i2 = ((AnonymousClass7IC) pollLastEntry.getValue()).A00;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            switch (i2) {
                                                case 11:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), (int[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), (int[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                                case 12:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), (long[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), (long[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                                case 13:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), (double[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), (double[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                                case 14:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), (boolean[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), (boolean[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                                case 15:
                                                    if (num != null) {
                                                        r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), (String[]) A00(pollLastEntry));
                                                        break;
                                                    } else {
                                                        r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), (String[]) A00(pollLastEntry));
                                                        break;
                                                    }
                                            }
                                        } else if (num == null) {
                                            r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), (String) A00(pollLastEntry));
                                        } else {
                                            r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), (String) A00(pollLastEntry));
                                        }
                                    } else if (num == null) {
                                        r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), AnonymousClass001.A1Z(A00(pollLastEntry)));
                                    } else {
                                        r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), AnonymousClass001.A1Z(A00(pollLastEntry)));
                                    }
                                } else if (num == null) {
                                    r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), ((Double) A00(pollLastEntry)).doubleValue());
                                } else {
                                    r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), ((Double) A00(pollLastEntry)).doubleValue());
                                }
                            } else if (num == null) {
                                r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), C18320x8.A05(A00(pollLastEntry)));
                            } else {
                                r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), C18320x8.A05(A00(pollLastEntry)));
                            }
                        } else if (num == null) {
                            r5.markerAnnotate(i, C18310x6.A0q(pollLastEntry), AnonymousClass0x7.A05(A00(pollLastEntry)));
                        } else {
                            r5.markerAnnotate(i, num.intValue(), C18310x6.A0q(pollLastEntry), AnonymousClass0x7.A05(A00(pollLastEntry)));
                        }
                    } catch (Exception unused) {
                        this.A03.Ax3(i, C18310x6.A0q(pollLastEntry));
                    }
                }
            } else if (num != null) {
                r5.markerEnd(i, num.intValue(), this.A01);
                return;
            } else {
                r5.markerEnd(i, this.A01);
                return;
            }
        }
    }

    public EventBuilder setActionId(short s) {
        this.A01 = s;
        return this;
    }

    public EventBuilder setLevel(int i) {
        this.A00 = i;
        return this;
    }

    public AnonymousClass847(AnonymousClass4FX r2, C186548vX r3, Integer num, String str, int i) {
        this.A04 = r3;
        this.A03 = r2;
        this.A06 = str;
        this.A02 = i;
        this.A05 = num;
    }

    public static Object A00(Map.Entry entry) {
        return ((AnonymousClass7IC) entry.getValue()).A01;
    }

    public EventBuilder annotate(String str, double d) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(Double.valueOf(d), str, this.A07, 3);
        }
        return this;
    }

    public EventBuilder annotate(String str, int i) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(Integer.valueOf(i), str, this.A07, 1);
        }
        return this;
    }

    public EventBuilder annotate(String str, long j) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(Long.valueOf(j), str, this.A07, 2);
        }
        return this;
    }

    public EventBuilder annotate(String str, String str2) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(str2, str, this.A07, 5);
        }
        return this;
    }

    public EventBuilder annotate(String str, boolean z) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(Boolean.valueOf(z), str, this.A07, 4);
        }
        return this;
    }

    public EventBuilder annotate(String str, double[] dArr) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(dArr, str, this.A07, 13);
        }
        return this;
    }

    public EventBuilder annotate(String str, int[] iArr) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(iArr, str, this.A07, 11);
        }
        return this;
    }

    public EventBuilder annotate(String str, long[] jArr) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(jArr, str, this.A07, 12);
        }
        return this;
    }

    public EventBuilder annotate(String str, String[] strArr) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(strArr, str, this.A07, 15);
        }
        return this;
    }

    public EventBuilder annotate(String str, boolean[] zArr) {
        if (str != null && AnonymousClass757.A00(this.A00)) {
            A01(zArr, str, this.A07, 14);
        }
        return this;
    }
}
