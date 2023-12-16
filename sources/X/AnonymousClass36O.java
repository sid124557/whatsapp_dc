package X;

/* renamed from: X.36O  reason: invalid class name */
public class AnonymousClass36O {
    public static C633138t A00(byte b, boolean z) {
        if (b != 0) {
            if (b != 1) {
                if (b != 3) {
                    if (b == 9) {
                        return C633138t.A0A;
                    }
                    if (b == 13) {
                        return C633138t.A0B;
                    }
                    if (b == 26) {
                        return C633138t.A0c;
                    }
                    if (b != 57) {
                        if (b != 62) {
                            throw AnonymousClass000.A0G("media-file-type: The media type is not supported: type=", AnonymousClass001.A0o(), b);
                        }
                    }
                }
                return C633138t.A0h;
            }
            return C633138t.A0D;
        } else if (z) {
            return C633138t.A0U;
        } else {
            return C633138t.A0I;
        }
    }

    public static C633138t A01(C95814uZ r4, byte b, int i) {
        if (i == 8) {
            if (b == 0 || b == 1) {
                return C633138t.A0m;
            }
            if (b == 3) {
                return C633138t.A0n;
            }
            if (b == 13) {
                return C633138t.A0l;
            }
            throw AnonymousClass000.A0G("media-file-type: The media type is not supported for origin=8: type=", AnonymousClass001.A0o(), b);
        } else if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b == 9) {
                        return C633138t.A09;
                    }
                    if (b != 13) {
                        if (b != 20) {
                            if (b == 23) {
                                return C633138t.A0Z;
                            }
                            if (b == 35) {
                                return C633138t.A0L;
                            }
                            if (b == 37) {
                                return C633138t.A07;
                            }
                            if (b == 57) {
                                return C633138t.A0F;
                            }
                            if (b == 65) {
                                return C633138t.A0X;
                            }
                            if (b == 96) {
                                return C633138t.A0K;
                            }
                            if (b == 25) {
                                return C633138t.A0e;
                            }
                            if (b == 26) {
                                return C633138t.A0c;
                            }
                            if (b == 28) {
                                return C633138t.A0f;
                            }
                            if (b == 29) {
                                return C633138t.A0d;
                            }
                            if (b == 62) {
                                return C633138t.A0G;
                            }
                            if (b == 63) {
                                return C633138t.A0E;
                            }
                            if (b == 81) {
                                return C633138t.A0a;
                            }
                            if (b == 82) {
                                return C633138t.A0i;
                            }
                            switch (b) {
                                case 42:
                                    return C633138t.A0j;
                                case 43:
                                    return C633138t.A0k;
                                case 44:
                                    return C633138t.A0W;
                                default:
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("media-file-type: The media type is not supported: type=");
                                    A0o.append(b);
                                    throw AnonymousClass000.A0G(", mediaOrigin=", A0o, i);
                            }
                        } else if (r4 instanceof C95804uY) {
                            return C633138t.A0T;
                        } else {
                            return C633138t.A0b;
                        }
                    } else if (r4 instanceof C95804uY) {
                        return C633138t.A0Q;
                    } else {
                        return C633138t.A04;
                    }
                } else if (r4 instanceof C95804uY) {
                    return C633138t.A0V;
                } else {
                    return C633138t.A0g;
                }
            } else if (r4 instanceof C95804uY) {
                if (i == 1) {
                    return C633138t.A0S;
                }
                return C633138t.A0O;
            } else if (i == 1) {
                return C633138t.A0J;
            } else {
                return C633138t.A05;
            }
        } else if (i == 6) {
            return C633138t.A0H;
        } else {
            if (r4 instanceof C95804uY) {
                return C633138t.A0R;
            }
            return C633138t.A0C;
        }
    }

    public static C633138t A02(C624134x r3) {
        return A01(r3.A1J.A00, r3.A1I, r3.A09);
    }

    public static boolean A03(C633138t r2) {
        if (r2 == C633138t.A05 || r2 == C633138t.A0J || r2 == C633138t.A0O || r2 == C633138t.A0S || r2 == C633138t.A0i) {
            return true;
        }
        return false;
    }

    public static boolean A04(C633138t r2) {
        if (r2 == C633138t.A0C || r2 == C633138t.A0j || r2 == C633138t.A0e || r2 == C633138t.A0Z || r2 == C633138t.A07 || r2 == C633138t.A0H || r2 == C633138t.A0X || r2 == C633138t.A0M || r2 == C633138t.A08 || r2 == C633138t.A0R || r2 == C633138t.A0F) {
            return true;
        }
        return false;
    }

    public static boolean A05(C633138t r2) {
        if (r2 == C633138t.A0R || r2 == C633138t.A0V || r2 == C633138t.A0U || r2 == C633138t.A0S || r2 == C633138t.A0O || r2 == C633138t.A0P || r2 == C633138t.A0Q || r2 == C633138t.A0T) {
            return true;
        }
        return false;
    }

    public static boolean A06(C633138t r2) {
        if (r2 == C633138t.A0b || r2 == C633138t.A0T) {
            return true;
        }
        return false;
    }

    public static boolean A07(C633138t r2) {
        if (r2 == C633138t.A0g || r2 == C633138t.A0k || r2 == C633138t.A0N || r2 == C633138t.A0a || r2 == C633138t.A0V || r2 == C633138t.A0G) {
            return true;
        }
        return false;
    }

    public static boolean A08(C633138t r2) {
        if (A07(r2) || r2 == C633138t.A04 || r2 == C633138t.A0Q) {
            return true;
        }
        return false;
    }

    public static boolean A09(C633138t r2) {
        if (A08(r2) || r2 == C633138t.A0f || r2 == C633138t.A0d) {
            return true;
        }
        return false;
    }
}
