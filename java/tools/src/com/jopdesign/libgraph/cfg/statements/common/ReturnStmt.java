/*
 * Copyright (c) 2007,2008, Stefan Hepp
 *
 * This file is part of JOPtimizer.
 *
 * JOPtimizer is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * JOPtimizer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jopdesign.libgraph.cfg.statements.common;

import com.jopdesign.libgraph.cfg.statements.ControlFlowStmt;
import com.jopdesign.libgraph.struct.type.TypeInfo;

/**
 * @author Stefan Hepp, e0026640@student.tuwien.ac.at
 */
public abstract class ReturnStmt extends AbstractStatement implements ControlFlowStmt {

    private TypeInfo type;

    public ReturnStmt() {
        this.type = null;
    }

    public ReturnStmt(TypeInfo type) {
        if ( type != null && type.getType() != TypeInfo.TYPE_VOID ) {
            this.type = type;
        } else {
            this.type = null;
        }
    }

    public TypeInfo getType() {
        return type;
    }

    public boolean canThrowException() {
        return false;
    }

    public boolean isAlwaysTaken() {
        return true;
    }
}